package com.assuresoftComposite.TestCompositePattern;


import com.assuresoftCommand.Order;
import com.assuresoftComposite.Department;
import com.assuresoftComposite.HeadDepartment;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.isA;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class HeadDepartmentTest {
   private HeadDepartment headDepartment;
   private Department department;

   @Before
   public void setUpseMonk(){
       headDepartment =mock(HeadDepartment.class);
       department=mock(Department.class);
   }

    @Test
    public void addDepartment() throws Exception{
        List<Department> departmentList= new ArrayList<>();
        List spy= Mockito.spy(departmentList);
        doReturn(true).when(spy).add(department);
        assertTrue(spy.add(department));

    }

    @Test
    public void removeDepartment() {
        List<Department> departmentList= new ArrayList<>();
        List spy= Mockito.spy(departmentList);
        doReturn(true).when(spy).remove(department);
        assertTrue(spy.add(department));
    }

    @Test
    public void printDepartament() throws Exception{
        doNothing().when(headDepartment).printDepartament();
    }
}
