import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String title;
    private List<String> capitulo;

    public Livro(String title) {
        this.title = title;
        this.capitulo = new ArrayList<>();
    }

    public void addCapitulo(String chapterTitle) {
        capitulo.add(chapterTitle);
    }

    public String getTitle() {
        return title;
    }

    public List<String> getCapitulo() {
        return capitulo;
    }
}
