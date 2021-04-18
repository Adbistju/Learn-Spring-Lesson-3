package ru.adbistju.tes;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AuthorsService {
    ArrayList<Author> arrayList = new ArrayList<>();

    {
        Author author = new Author();
        author.setFirstName("1");
        author.setLastName("1");
        author.setEmail("1");
        arrayList.add(author);

    }

    public void save(Author author){
        arrayList.add(author);
    }
}
