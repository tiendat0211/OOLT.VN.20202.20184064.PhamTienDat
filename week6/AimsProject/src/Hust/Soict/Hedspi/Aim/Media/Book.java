package Media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String authorName){
        if(authors.contains(authorName) == false){
            authors.add(authorName);
        }
        else System.out.println("Already exist");
    }

    public void removeAuthor(String authorName){
        if(authors.contains(authorName)){
            authors.remove(authorName);
        } else System.out.println("Does not exist");
    }

    public Book(String title){
        super.title=title;
    }

    public Book(String title,String category){
        super.title=title;
        super.category=category;
    }

    
    public Book(String title, String category, float cost) {
        super.title=title;
        super.category=category;
        super.cost=cost;
    }

    public Book(int id,String title,String category,float cost){
        super.id=id;
        super.title=title;
        super.category=category;
        super.cost=cost;
    }
    
    @Override
    public String showInfo() {
        return "Book. ID: " + getId() +  "- Title: " + getTitle() + ", Category: " + getCategory() + ", Cost: " + getCost() + ", Authors: " + getAuthors();
    }

    public Book(int id, String title, String category, float cost, List<String> authors) {
        super.id=id;
        super.title=title;
        super.category=category;
        super.cost=cost;
        this.authors = authors;
    }
}
