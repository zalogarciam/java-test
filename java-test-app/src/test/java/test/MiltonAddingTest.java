package test;

import org.example.models.MiltonAdding;

public class MiltonAddingTest {

    private MiltonAdding miltonAdding;

    @BeforeEach
    public void setUp{ miltonAdding= new MiltonAdding(); }

    @Test
    public void testAdding(){
        var expectAdding= 48;
        int n1=14;
        int n2=34;

        var actualAdding= miltonAdding.Adding(n1,n2);

        assertEquals(expectAdding, actualAdding);
    }
}
