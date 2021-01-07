package book;


public class AuthorAPI {

    public Author[] getAllBooks() {
        return AuthorRepository.getData();
    }


    public String[] getAuthors() {
        String[] authorName = new String[AuthorRepository.getData().length];
        for (int i = 0; i < AuthorRepository.getData().length; i++) {
            authorName[i] = AuthorRepository.getData()[i].name;
        }
        return authorName;
    }

    public static Author[] matchinNamesToGivenString(String name) {
        int j = 0;
        Author[] matchingNamesToGivenString = new Author[AuthorRepository.getData().length];
        for (int i = 0; i < AuthorRepository.getData().length; i++) {
            if (name.equals(AuthorRepository.getData()[i].name)) {
                matchingNamesToGivenString[j++] = AuthorRepository.getData()[i];
            }
        }
        return matchingNamesToGivenString;
    }
}

