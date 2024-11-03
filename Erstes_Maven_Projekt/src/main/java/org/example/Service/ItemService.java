package org.example.Service;


import org.example.Repository.ItemRepository;
import org.example.tableclasses.item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<item> getAllItems() {
        return itemRepository.findAll();
    }

    public item saveItem(item item) {
        return itemRepository.save(item);
    }

    public Optional<item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
