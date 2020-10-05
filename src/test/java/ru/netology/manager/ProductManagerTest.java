package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(new ProductRepository());
    private Book first = new Book(1, "American Gods", 100, "Neil Gainman");
    private Book second = new Book(2, "Anansi Boys", 200, "Neil Gainman");
    private Book third = new Book(3, "The Goldfinch", 300, "Donna Tartt");
    private Smartphone fourth = new Smartphone(4, "Honor 30", 400, "Huawei Technologies");
    private Smartphone fifh = new Smartphone(5, "Galaxy A50", 500, "Samsung Electronics");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifh);
    }

    @Test
    void searchBookByName() {

        Product[] actual = manager.searchBy("The Goldfinch");
        Product[] expected = new Product[]{third};

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchBookByAuthor() {

        Product[] actual = manager.searchBy("Neil Gainman");
        Product[] expected = new Product[]{first, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchSmartphoneByName() {

        Product[] actual = manager.searchBy("Galaxy A50");
        Product[] expected = new Product[]{fifh};

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchSmartphoneByMaker() {

        Product[] actual = manager.searchBy("Huawei Technologies");
        Product[] expected = new Product[]{fourth};

        assertArrayEquals(expected, actual);
    }

}