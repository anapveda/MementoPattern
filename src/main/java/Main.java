public class Main {
    public static void main(String args[]){
        State s=new State(20);
        MementoClass m=new MementoClass();
        m.setStae(s);
        OriginatorClass o=new OriginatorClass();
        o.setMemento(m);
        CareTackerClass c=new CareTackerClass();
        c.addMemento(m);


        System.out.println(o.getMemento().getState().getArea());

        State st=new State(30);
        MementoClass m1=new MementoClass();
        m1.setStae(st);

        o.setMemento(m1); // Update the same Originator object
        c.addMemento(m1);


        System.out.println("After new state: " + o.getMemento().getState().getArea());


        MementoClass previousMemento = c.undo();
        if (previousMemento != null) {
            o.setMemento(previousMemento);
        }

        System.out.println(o.getMemento().getState().getArea());//should print previous state














    }
}
