package ru.adbistju.test;

import org.springframework.stereotype.Component;
import ru.adbistju.tes.Author;

import java.util.ArrayList;

@Component
public class DAO {
    ArrayList<Author> arrayList = new ArrayList<>();

    {
        Author author = new Author();
        author.setFirstName("fd");
        author.setLastName("fd");
        author.id = 1;

        arrayList.add(author);
    }

    public ArrayList<Author> index(){
        return arrayList;
    }

    public Author show (int id) {
        return arrayList.
                stream().filter(author -> author.getId() == id).findAny().orElse(null);

    }
}
