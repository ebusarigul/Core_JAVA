package MySrc.Gun39._01_;

public class Ford extends BinekOto{


    @Override
    public String getMarka() {
        return "FORD";
    }

    @Override
    public int getUretimYili() {
        System.out.println("üretildigi yıl=");
        return super.getUretimYili();
    }
}
