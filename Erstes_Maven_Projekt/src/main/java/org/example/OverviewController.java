package org.example;

import org.example.Repository.BuyingCompanysRepository;
import org.example.Repository.ItemRepository;
import org.example.Repository.SellingCompanysRepository;
import org.example.tableclasses.*;
import org.example.Repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class OverviewController {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private BuyingCompanysRepository buyingCompanysRepository;
    @Autowired
    private SellingCompanysRepository sellingCompanysRepository;

    @GetMapping
    public String listEmployees(@RequestParam(required= false, defaultValue="employeID")String sortBy1,
                                @RequestParam(required= false, defaultValue="asc")String order1,

                                @RequestParam(required= false, defaultValue="itemID")String sortBy2,
                                @RequestParam(required= false, defaultValue="asc")String order2,

                                @RequestParam(required= false, defaultValue="buyingcompanyid")String sortBy3,
                                @RequestParam(required= false, defaultValue="asc")String order3,

                                @RequestParam(required= false, defaultValue="sellingcompanyid")String sortBy4,
                                @RequestParam(required= false, defaultValue="asc")String order4,


                                Model model
                                )
    {
        Sort sort1 = order1.equalsIgnoreCase("asc") ? Sort.by(sortBy1).ascending() : Sort.by(sortBy1).descending();
        Sort sort2 = order2.equalsIgnoreCase("asc") ? Sort.by(sortBy2).ascending() : Sort.by(sortBy2).descending();
        Sort sort3 = order3.equalsIgnoreCase("asc") ? Sort.by(sortBy3).ascending() : Sort.by(sortBy3).descending();
        Sort sort4 = order4.equalsIgnoreCase("asc") ? Sort.by(sortBy4).ascending() : Sort.by(sortBy4).descending();


        model.addAttribute("employees", employeeRepository.findAll(sort1));
        model.addAttribute("items", itemRepository.findAll(sort2));
        model.addAttribute("buyingcompanys", buyingCompanysRepository.findAll(sort3));
        model.addAttribute("sellingcompanys", sellingCompanysRepository.findAll(sort4));

        return "overview";
    }
    // Formular für neuen Mitarbeiter anzeigen
    @GetMapping("/employees/new")
    public String showCreateFormEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "new-employee";
    }

    // Neuen Mitarbeiter hinzufügen
    @PostMapping("/employees/new")
    public String createEmployee(@ModelAttribute Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/";
    }

    // Mitarbeiter bearbeiten (Formular anzeigen)
    @GetMapping("/employees/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeRepository.findById(Long.valueOf(id)).orElseThrow(() -> new IllegalArgumentException("Invalid employee ID:" + id));
        model.addAttribute("employee", employee);
        return "edit-employee";
    }

    // Änderungen speichern
    @PostMapping("/employees/{id}")
    public String updateEmployee(@PathVariable("id") Integer id, @ModelAttribute Employee employee) {
        employee.setEmployeID(id); // sicherstellen, dass die ID gesetzt ist
        employeeRepository.save(employee);
        return "redirect:/";
    }

    // Mitarbeiter löschen
    @GetMapping("/employees/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        Employee employee = employeeRepository.findById(Long.valueOf(id)).orElseThrow(() -> new IllegalArgumentException("Invalid employee ID:" + id));
        employeeRepository.delete(employee);
        return "redirect:/";
    }






    @GetMapping("/item/new")
    public String showCreateFormItem(Model model) {
        model.addAttribute("sellingcompanys", sellingCompanysRepository.findAll());
        model.addAttribute("item", new item());
        return "new-item";
    }


    @PostMapping("/item/new")
    public String createItem(@ModelAttribute item item) {
        itemRepository.save(item);
        return "redirect:/";
    }


    @GetMapping("/item/edit/{id}")
    public String showEditFormItem(@PathVariable("id") Integer id, Model model) {

        model.addAttribute("sellingcompanys", sellingCompanysRepository.findAll());
        item item = itemRepository.findById(Long.valueOf(id)).orElseThrow(() -> new IllegalArgumentException("Invalid employee ID:" + id));
        model.addAttribute("item", item);
        return "edit-item";
    }


    @PostMapping("/item/{id}")
    public String updateItem(@PathVariable("id") Integer id, @ModelAttribute item item) {
        item.setItemID(id);
        itemRepository.save(item);
        return "redirect:/";
    }

    @GetMapping("/item/delete/{id}")
    public String deleteItem(@PathVariable("id") Integer id) {
        item item = itemRepository.findById(Long.valueOf(id)).orElseThrow(() -> new IllegalArgumentException("Invalid employee ID:" + id));
        itemRepository.delete(item);
        return "redirect:/";
    }








    @GetMapping("/buying_company/new")
    public String showCreateFormBuyingCompany(Model model) {
        model.addAttribute("buyingcompany", new Buyingcompany());
        return "new-buying-company";
    }


    @PostMapping("/buying_company/new")
    public String createBuyingCompany(@ModelAttribute Buyingcompany buyingcompany) {
        buyingCompanysRepository.save(buyingcompany);
        return "redirect:/";
    }


    @GetMapping("/buying_company/edit/{id}")
    public String showEditFormBuyingcompany(@PathVariable("id") Integer id, Model model) {
        Buyingcompany buyingcompany = buyingCompanysRepository.findById(Long.valueOf(id)).orElseThrow(() -> new IllegalArgumentException("Invalid employee ID:" + id));
        model.addAttribute("buyingcompany", buyingcompany);
        return "edit-buying-company";
    }


    @PostMapping("/buying_company/{id}")
    public String updateBuyingcompany(@PathVariable("id") Integer id, @ModelAttribute Buyingcompany buyingcompany) {
        buyingcompany.setBuyingcompanyid(id);
        buyingCompanysRepository.save(buyingcompany);
        return "redirect:/";
    }

    @GetMapping("/buying_company/delete/{id}")
    public String deleteBuyingcompany(@PathVariable("id") Integer id) {
        Buyingcompany buyingcompany = buyingCompanysRepository.findById(Long.valueOf(id)).orElseThrow(() -> new IllegalArgumentException("Invalid employee ID:" + id));
        buyingCompanysRepository.delete(buyingcompany);
        return "redirect:/";
    }









    @GetMapping("/selling_company/new")
    public String showCreateFormSellingCompany(Model model) {
        model.addAttribute("Sellingcompany", new Sellingcompany());
        return "new-selling-company";
    }


    @PostMapping("/selling_company/new")
    public String createSellingCompany(@ModelAttribute Sellingcompany sellingcompany) {
        sellingCompanysRepository.save(sellingcompany);
        return "redirect:/";
    }


    @GetMapping("/selling_company/edit/{id}")
    public String showEditFormSelling_company(@PathVariable("id") Integer id, Model model) {
        Sellingcompany sellingcompany = sellingCompanysRepository.findById(Long.valueOf(id)).orElseThrow(() -> new IllegalArgumentException("Invalid employee ID:" + id));
        model.addAttribute("sellingcompany", sellingcompany);
        return "edit-selling-company";
    }

    @PostMapping("/selling_company/{id}")
    public String updateSelling_company(@PathVariable("id") Integer id, @ModelAttribute Sellingcompany sellingcompany) {
        sellingcompany.setSellingcompanyid(id);
        sellingCompanysRepository.save(sellingcompany);
        return "redirect:/";
    }


    @GetMapping("/selling_company/delete/{id}")
    public String deleteSellingcompany(@PathVariable("id") Integer id) {
        Sellingcompany sellingcompany = sellingCompanysRepository.findById(Long.valueOf(id)).orElseThrow(() -> new IllegalArgumentException("Invalid employee ID:" + id));
        sellingCompanysRepository.delete(sellingcompany);
        return "redirect:/";
    }

    @GetMapping("/order")
    public String showCreateFormOrder(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        model.addAttribute("items", itemRepository.findAll());
        model.addAttribute("buyingcompanys", buyingCompanysRepository.findAll());
        model.addAttribute("sellingcompanys", sellingCompanysRepository.findAll());

        return "order";
    }





    @PostMapping("/order/new")
    public String CreateOrder(
            @RequestParam("order_companyoforiginID") long companyoforiginID,
            @RequestParam("items") List<ItemDTO> items
            ) {


        return"redirect:/";

    }






}














