public class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrismestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println("Gastos do Trismestre R$ " + gastosTrismestre);

        float mediaMensal = gastosTrismestre / 3;

        System.out.println("Media mensal de gastos R$ " + mediaMensal);
    }
}
