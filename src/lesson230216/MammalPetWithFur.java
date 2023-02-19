package lesson230216;

public abstract class MammalPetWithFur extends Pet {

    public abstract void comb(); //Абстрактный метод не имеет реализации

//    @Override
//    void care() {
//        super.care();
//        comb();
//    }

    @Override
    public void special() {
        comb();
    }
}
