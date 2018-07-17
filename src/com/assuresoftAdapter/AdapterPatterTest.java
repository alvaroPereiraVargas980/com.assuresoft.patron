package com.assuresoftAdapter;

public class AdapterPatterTest {
    public static void main(String [] arg){
        testClassAdapter();
        testObjetAdapter();

    }
    public static void testObjetAdapter(){
        SocketAdapter socketAdapter =new SocketsObjectAdapterImpl();
        Volt v3 = getVolt(socketAdapter,3);
        Volt v12= getVolt(socketAdapter,12);
        Volt v120= getVolt(socketAdapter,120);

        System.out.print("v3 volts using Object Adapter="+v3.getVolts());
        System.out.print("v12 volts using Object Adapter="+v12.getVolts());
        System.out.print("v123 volts using Object Adapter="+v120.getVolts());

    }

    public static void testClassAdapter(){
        SocketAdapter socketAdapter=new SocketClassAdapterImpl();
        Volt v3=getVolt(socketAdapter,3);
        Volt v12 = getVolt(socketAdapter,12);
        Volt v120 = getVolt(socketAdapter,120);

        System.out.print("v3 volts using Object Adapter="+v3.getVolts());
        System.out.print("v12 volts using Object Adapter="+v12.getVolts());
        System.out.print("v123 volts using Object Adapter="+v120.getVolts());
    }
    public static Volt getVolt(SocketAdapter socketAdapter, int i){

        switch (i){
            case 3:return socketAdapter.get3Volt();
            case 12:return socketAdapter.get12Volt();
            case 120:return socketAdapter.get120Volt();
            default: return socketAdapter.get120Volt();
        }
    }
}
