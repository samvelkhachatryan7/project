package book;


import java.util.Scanner;

public class Main {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("for registration press 1: ");
        System.out.println("for login press 2: ");
        int loginOption = scanner.nextInt();
        switch (loginOption){
            case 1:  String jsonObject = new Register().registration();
                JsonFunctionality.writeDataToJsonFile(jsonObject);

            case 2:
                Login login = new Login();
                login.loginToProgram();
                selection();
        }
    }
    public static void selection(){
        System.out.println("please choose one of the following options" +
                "\r\n 1: for get names of given author" +
                "\r\n 2: to get top 3 Books Of Given Author" +
                "\r\n 3: to get top get Names Of Matching Book" +
                "\r\n 4: to get release date of books" +
                "\r\n 5: to exit from the programme");
        int option = new Scanner(System.in).nextInt();
        switch (option) {
            case 1:
                Book[] authorBooks = BookAPI.getBooksOfGivenAuthor(AuthorRepository.getData()[(int) (Math.random() * 10)]);
                for (Book authorBook : authorBooks) {
                    if (authorBook != null) {
                        System.out.println(authorBook.getName());
                    }
                }
                selection();
                break;
            case 2:
                for (Book book : BookAPI.getTop3BooksOfGivenAuthor(AuthorRepository.getData()[(int) (Math.random() * 3)])) {
                    System.out.println(book.getName());
                }
                selection();
                break;
            case 3:
                System.out.println("please write book name");
                String bookName = new Scanner(System.in).nextLine();
                    System.out.println(BookAPI.getNamesOfMatchingBook(bookName)[0].getName());
                selection();
                break;
            case 4:
                BookAPI.getReleaseDtaesOfArrays();
                selection();
                break;
            case 5:
                System.out.println("exiting from the program");
                break;
        }
    }
}
