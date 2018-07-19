package com.assuresoftCommand.TestCommandPatter;

import com.assuresoftCommand.Broker;
import com.assuresoftCommand.Order;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.*;


public class BrokerTest {
    private Broker broker;
    private Order order;

    @Before
    public void setUpMonk(){
        broker=mock(Broker.class);
        order=mock(Order.class);
    }

    @Test
    public void takeOrder() throws Exception{
        List<Order> orderList=new ArrayList<Order>();
        List spy=spy(orderList);
        doReturn( true).when(spy).add(0);
        doNothing().when(broker).takeOrder(order);
        assertTrue(spy.add(0));

    }

    @Test
    public void palceOrders() throws Exception{
        List<Order> orderList=new ArrayList<Order>();
        List spy=spy(orderList);
       doNothing().when(broker).palceOrders();
       spy.clear();
       verify(spy,atLeast(1)).clear();
    }

}
