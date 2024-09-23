public class Frota {
    public static void main(String[] args) {
        Pickup jpf = new Pickup(5,10,10.0,true,100,100);
        Motocicleta kkk = new Motocicleta(2, 100, 20.0, 3);
        Carro jjj = new Carro(5, 100,20.1, false);
        Hatch ppp = new Hatch(3,20, 3.0, false, 50);

        System.out.println(jpf.autonomia());
        System.out.println(kkk.autonomia());
        System.out.println(ppp.autonomia());

        System.out.print(ppp.calculaVolume(2));

        

    }
}
