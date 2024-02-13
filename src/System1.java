import java.util.Scanner;
import java.util.regex.Pattern;
public class System1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checkCondition = false;
        Book[] books = new Book[50];
        books[0] = new Book(1, "java", "KSHRD", 2024);
        books[1] = new Book(2, "web", "KSHRD", 2024);
        books[2] = new Book(3, "Spring", "KSHRD", 2024);
        int up = 3;
        do {
            System.out.println("-----------------------------------");
            System.out.println("LIBRARY IN PHNOM PENH");
            System.out.println("1- Add Book");
            System.out.println("2- Show All Books");
            System.out.println("3- Show Available Books");
            System.out.println("4- Borrow Book");
            System.out.println("5- Return Book");
            System.out.println("6- Exit");
            System.out.println("----------------------------------------");
            do {
                System.out.println("Choose option (1-6) : ");
                int option = sc.nextInt();
                switch (option) {
                    case 1: {
                        do {
                            System.out.println("Input id: " + (up + 1));
                            sc.nextLine();
                            System.out.println("Input Title: ");
                            String title = sc.nextLine();
                            System.out.println("Input author: ");
                            String author = sc.nextLine();
                            System.out.println("Input publish year: ");
                            int published_year = sc.nextInt(); sc.nextLine();
                            books[up] = new Book((up + 1), title, author, published_year);
                            up++;
                            System.out.print("do u want (y/n): ");
                            String op = sc.nextLine();
                            if(op.equals("n")){
                                break;
                            }
                        } while (true);
                        checkCondition = false;
                        break;
                    }
                    case 2: {
                        if (up > 3) {
                            for (int i = 0; i < up; i++) {
                                Book book = books[i];
                                if(book != null ){
                                    if(book.getBorrowed()){
                                        System.out.println("ID: " + book.getId());
                                        System.out.println("name: " + book.getTitle());
                                        System.out.println("author: " + book.getAuthor());
                                        System.out.println("year: " + book.getPublished_year());
                                        System.out.println("Unvarible" );
                                    }else {
                                        System.out.println("ID: " + book.getId());
                                        System.out.println("name: " + book.getTitle());
                                        System.out.println("author: " + book.getAuthor());
                                        System.out.println("year: " + book.getPublished_year());
                                        System.out.println("Varible" );
                                    }
                                }
                            }
                        } else {
                            System.out.println("No book add yets !");
                        }
                        checkCondition = false;
                        break;
                    }
                    case 3: {
                        if(up>0){
                            boolean variableExit = false;
                            for(int i=0; i< up; i++){
                                Book book = books[i];
                                if(book !=null && !book.getBorrowed()){
                                    System.out.println(Integer.toString(book.getId()));
                                    System.out.println(book.getTitle());
                                    System.out.println (book.getAuthor());
                                    System.out.println(Integer.toString(book.getPublished_year()));
                                    System.out.println("Varible" );
                                    variableExit = true;

                                }
                            }
                            if(variableExit){
                                System.out.println("Avalible Book");
                            }else {
                                System.out.println("No books");
                            }
                        }else {
                            System.out.println("No book add yets ! ");
                        }
                        checkCondition = false;
                        break;
                    }
                    case 4: {
                        if(up>3){
                            System.out.println("enter id book :");
                            int borrowid = sc.nextInt();
                            boolean count = false;
                            for(int i=0;i<up;i++){
                                Book book = books[i];
                                if(book != null && book.getId()==borrowid){
                                    if (!book.getBorrowed()){
                                        book.setBorrowed(true);
                                        System.out.println("Book with ID : " +borrowid+ "has been successfully! ");
                                    }else {
                                        System.out.println("Book with ID : " +borrowid+ "already have !");
                                    }
                                    count = true;
                                    break;
                                }
                            }
                            if(!count){
                                System.out.println("Book with ID : " +borrowid+ " dont have ...");
                            }
                        }else {
                            System.out.println("No book add yets !");
                        }
                        break;
                    }
                    case 5: {
                        if(up>3){
                            System.out.println(" retun id come back : ");
                            int backid = sc.nextInt();

                            boolean find = false;
                            for(int i=0; i<up;i++){
                                Book book = books[i];
                                if(book != null && book.getId()==backid){
                                    if (!book.getBorrowed()){
                                        book.setBorrowed(false);
                                        System.out.println("Book with ID : " +backid+ "has been successfully! ");
                                    }else {
                                        System.out.println("Book with ID : " +backid+ "already have !");
                                    }
                                    find = true;
                                    break;
                                }
                            }
                            if(!find){
                                System.out.println("Book with ID : " +backid+ " dont have ...");
                            }
                        }else {
                            System.out.println("No book add yets !");
                        }
                        break;
                    }
                    case 6: {
                        System.out.println("Exit good bye .....");
                        return;
                    }
                    default: {
                        System.out.println("Please try again!");
                        checkCondition = true;
                    }
                }
            } while (checkCondition);
        } while (true);
    }
}