package BehavioralDP.ChainOfResponsibiltyDP;

class GenelMudur extends Approver {

    public GenelMudur() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {
        System.out.println("Genel Müdür onayladı");
        System.out.println("*************************");
        return true;
    }
}
