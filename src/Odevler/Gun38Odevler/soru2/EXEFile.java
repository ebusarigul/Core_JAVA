package Odevler.Gun38Odevler.soru2;

public class EXEFile implements IReadFile{
    @Override
    public String open() {
        return "opening.exe";
    }

    @Override
    public String read() {
        return "reading.exe";
    }

    @Override
    public String save() {
        return "saving.exe";
    }

    @Override
    public String close() {
        return "close.exe";
    }
}
