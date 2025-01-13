package com.example.sofrahazir.Service;

import com.example.sofrahazir.Entity.Menu;
import com.example.sofrahazir.Repository.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MenuService {
    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public Optional<Menu> getCustomerById(Long id) {
        return menuRepository.findById(id);
    }

    public Menu createCustomer(Menu menu) {
        return menuRepository.save(menu);
    }
}
