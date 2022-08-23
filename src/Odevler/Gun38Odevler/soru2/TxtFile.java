package Odevler.Gun38Odevler.soru2;

public class TxtFile implements IReadFile{
    @Override
    public String open() {
        return "opening.txt";
    }

    @Override
    public String read() {
        return "reading.txt";
    }

    @Override
    public String save() {
        return "saving.txt";
    }

    @Override
    public String close() {
        return "closing.txt";
    }
}
