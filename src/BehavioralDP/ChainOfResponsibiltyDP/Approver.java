package BehavioralDP.ChainOfResponsibiltyDP;
// yetki dağılımı için ana interface
public abstract class Approver {
   Approver chief;

    public Approver(Approver chief) {
        this.chief = chief;
    }

    abstract boolean approveLoan(int amount);
}
