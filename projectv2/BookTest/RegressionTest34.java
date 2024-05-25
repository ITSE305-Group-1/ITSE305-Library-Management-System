
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test001"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i23 = testingRandoope0.sum(227, 60, 44);
    int i26 = testingRandoope0.sum(551, 439);
    int i30 = testingRandoope0.sum(551, 331, 137);
    int i34 = testingRandoope0.sum(4463, 14068, 7835);
    int i38 = testingRandoope0.sum(39376, 191941, 91960);
    int i42 = testingRandoope0.sum(115765, 45192, 6030);
    int i46 = testingRandoope0.sum(1597370, 1850484, 1613344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 990);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1019);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 26366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 323277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 166987);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 5061198);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test002"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i7 = testingRandoope0.sum((int)(short)1, 99, (int)(short)1);
    int i11 = testingRandoope0.sum(430, 0, 576);
    int i15 = testingRandoope0.sum(576, 2767, 20698);
    int i19 = testingRandoope0.sum(21362, 247, 7686);
    int i22 = testingRandoope0.sum(5131, 19848);
    int i26 = testingRandoope0.sum(1660232, 908536, 2663358);
    int i29 = testingRandoope0.sum(3626859, 2352006);
    int i32 = testingRandoope0.sum(0, 1368507);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1006);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 24041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 29295);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 24979);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 5232126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 5978865);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1368507);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test003"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i10 = testingRandoope0.sum((int)(short)1, 0);
    int i13 = testingRandoope0.sum((int)'#', 10);
    int i17 = testingRandoope0.sum(557, 697, 99);
    int i21 = testingRandoope0.sum((int)(byte)1, 7752, 996);
    int i24 = testingRandoope0.sum(1154, 4153);
    int i27 = testingRandoope0.sum(5131, 6266);
    int i30 = testingRandoope0.sum(557, 16025);
    int i33 = testingRandoope0.sum(85423, 27139);
    int i37 = testingRandoope0.sum(13948, 8705, 10645);
    int i40 = testingRandoope0.sum(58725, 118405);
    int i43 = testingRandoope0.sum(134979, 40553);
    int i47 = testingRandoope0.sum(8500, 221870, 214);
    int i51 = testingRandoope0.sum(104409, 338051, 196107);
    int i55 = testingRandoope0.sum(1286133, 596054, 1411363);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1353);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8749);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5307);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 11397);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 16582);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 112562);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 33298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 177130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 175532);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 230584);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 638567);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 3293550);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test004"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(149, 98);
    int i17 = testingRandoope0.sum(227, 389);
    int i21 = testingRandoope0.sum(214, 161, 932);
    int i24 = testingRandoope0.sum(214, 932);
    int i28 = testingRandoope0.sum(1252644, 352873, 1921982);
    int i31 = testingRandoope0.sum(3583330, 463049);
    int i35 = testingRandoope0.sum(0, 10103642, 331108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1307);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 3527499);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 4046379);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 10434750);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test005"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum(100, 0);
    int i9 = testingRandoope0.sum((-1), (int)(short)100);
    int i12 = testingRandoope0.sum(9, (int)(short)0);
    int i15 = testingRandoope0.sum(10, 217);
    int i18 = testingRandoope0.sum(369, 149);
    int i21 = testingRandoope0.sum(1268, 137);
    int i24 = testingRandoope0.sum(323, 2933);
    int i28 = testingRandoope0.sum(137, 11516, 5261);
    int i31 = testingRandoope0.sum(23875, (int)(short)10);
    int i34 = testingRandoope0.sum(8705, 9622);
    int i37 = testingRandoope0.sum(2424256, 0);
    int i40 = testingRandoope0.sum(8797287, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1405);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 16914);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 23885);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 18327);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 2424256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 8797287);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test006"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum(3707, 1945, 662);
    int i11 = testingRandoope0.sum(4267, 893);
    int i14 = testingRandoope0.sum(186555, 337507);
    int i18 = testingRandoope0.sum(36904, 29455, 29965);
    int i21 = testingRandoope0.sum(996, 630903);
    int i24 = testingRandoope0.sum(14068, 449907);
    int i27 = testingRandoope0.sum(516623, 645338);
    int i30 = testingRandoope0.sum(683241, 8788766);
    int i34 = testingRandoope0.sum(282690, 9591, 5483014);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 6314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 5160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 524062);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 96324);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 631899);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 463975);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1161961);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 9472007);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 5775295);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test007"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum((int)(short)10, 99);
    int i21 = testingRandoope0.sum(51, 98);
    int i25 = testingRandoope0.sum(33, 649, 2525);
    int i28 = testingRandoope0.sum((int)' ', 51);
    int i31 = testingRandoope0.sum(683, 227);
    int i35 = testingRandoope0.sum(1173, 2560, 259);
    int i38 = testingRandoope0.sum(169283, 21426);
    int i41 = testingRandoope0.sum(823660, 2225217);
    int i44 = testingRandoope0.sum(2642162, 29783);
    int i47 = testingRandoope0.sum(3024836, 2413);
    int i50 = testingRandoope0.sum(264212, 87825);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 910);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 3992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 190709);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 3048877);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 2671945);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 3027249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 352037);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test008"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)' ', (int)'#', 150);
    int i12 = testingRandoope0.sum(12087, 5146, 21782);
    int i15 = testingRandoope0.sum(14351, 29561);
    int i18 = testingRandoope0.sum(53601, 38694);
    int i22 = testingRandoope0.sum(13415, 94878, 2684897);
    int i26 = testingRandoope0.sum(1149579, 3076792, 456895);
    int i29 = testingRandoope0.sum(102031, 358923);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 39015);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 43912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 92295);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2793190);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 4683266);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 460954);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test009"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum(100, 0);
    int i10 = testingRandoope0.sum((int)' ', 0, (int)(short)0);
    int i13 = testingRandoope0.sum(98, (int)' ');
    int i17 = testingRandoope0.sum((int)(byte)10, 1, 10);
    int i20 = testingRandoope0.sum(132, 237);
    int i23 = testingRandoope0.sum(160, 99);
    int i26 = testingRandoope0.sum(74763, 33108);
    int i30 = testingRandoope0.sum(3562886, 5584698, 2823631);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 259);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 107871);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11971215);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test010"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i22 = testingRandoope0.sum(32, (int)(short)1);
    int i25 = testingRandoope0.sum((int)(byte)0, 85);
    int i29 = testingRandoope0.sum(1944, 6524, 1328);
    int i33 = testingRandoope0.sum(747, 777, 1328);
    int i36 = testingRandoope0.sum(45900, 910);
    int i39 = testingRandoope0.sum(64175, 21512);
    int i43 = testingRandoope0.sum(524933, 643333, 14818);
    int i47 = testingRandoope0.sum(128907, 78574, 11867);
    int i50 = testingRandoope0.sum(40670, 1295196);
    int i53 = testingRandoope0.sum(13974, 194534);
    int i57 = testingRandoope0.sum(2115097, 4509898, 112822);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 9796);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2852);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 46810);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 85687);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1183084);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 219348);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1335866);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 208508);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 6737817);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test011"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i23 = testingRandoope0.sum(214, 576, 269);
    int i26 = testingRandoope0.sum(1599, 33);
    int i30 = testingRandoope0.sum(19, 1327, 5492);
    int i34 = testingRandoope0.sum(1707653, 43506, 101663);
    int i38 = testingRandoope0.sum(1951063, 3784683, 11514001);
    int i41 = testingRandoope0.sum(3987735, 3463027);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1059);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1632);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 6838);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1852822);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 17249747);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 7450762);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test012"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(182, 1353, 439);
    int i15 = testingRandoope0.sum(149, 101, 13939);
    int i18 = testingRandoope0.sum(28291, 15452);
    int i22 = testingRandoope0.sum(881329, 709688, 37474);
    int i25 = testingRandoope0.sum(3343281, 1319796);
    int i28 = testingRandoope0.sum(1915577, 1210160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1974);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 14189);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 43743);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1628491);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 4663077);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 3125737);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test013"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i14 = testingRandoope0.sum(260, 130);
    int i17 = testingRandoope0.sum(9, 10636);
    int i20 = testingRandoope0.sum(815, 5373);
    int i23 = testingRandoope0.sum(10597, 21782);
    int i27 = testingRandoope0.sum(11203, 2915, 19848);
    int i31 = testingRandoope0.sum(10636, 6046, 68081);
    int i34 = testingRandoope0.sum(0, 192891);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 390);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 6188);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 32379);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 33966);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 84763);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 192891);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test014"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum((int)(short)100, 149, 64);
    int i19 = testingRandoope0.sum(340, 11, 298);
    int i23 = testingRandoope0.sum((int)(short)1, 2525, 430);
    int i27 = testingRandoope0.sum(117, 0, 815);
    int i31 = testingRandoope0.sum(32708, 6048, 164202);
    int i35 = testingRandoope0.sum(1352506, 292225, 1019);
    int i39 = testingRandoope0.sum(53877, 1756203, 1932382);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 313);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 649);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2956);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 932);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 202958);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1645750);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 3742462);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test015"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum(260, 323, (int)(byte)0);
    int i7 = testingRandoope0.sum(3207, 3992);
    int i11 = testingRandoope0.sum(0, 19, 54531);
    int i15 = testingRandoope0.sum(29035, 115349, 369003);
    int i19 = testingRandoope0.sum(21058, 447640, 61859);
    int i23 = testingRandoope0.sum(236027, 1520992, 119520);
    int i26 = testingRandoope0.sum(10590343, 14695669);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 583);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 7199);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 54550);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 513387);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 530557);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1876539);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 25286012);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test016"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(130, 451);
    int i28 = testingRandoope0.sum(152, 1116);
    int i31 = testingRandoope0.sum(150, 655);
    int i34 = testingRandoope0.sum(27639, 990);
    int i37 = testingRandoope0.sum(5824, 22151);
    int i40 = testingRandoope0.sum(308760, 15581);
    int i43 = testingRandoope0.sum(651358, 121096);
    int i47 = testingRandoope0.sum(6045467, 11481805, 2820903);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 805);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 28629);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 27975);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 324341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 772454);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 20348175);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test017"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(149, 98);
    int i18 = testingRandoope0.sum(407, 1, 407);
    int i21 = testingRandoope0.sum(2645, 161);
    int i24 = testingRandoope0.sum(5124, 14068);
    int i28 = testingRandoope0.sum(2924, 17293, 24527);
    int i32 = testingRandoope0.sum(1088795, 354089, 1327727);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 815);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2806);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 19192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 44744);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 2770611);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test018"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i7 = testingRandoope0.sum((int)(short)1, 99, (int)(short)1);
    int i10 = testingRandoope0.sum(2358, 4057);
    int i13 = testingRandoope0.sum(52188, 6914);
    int i16 = testingRandoope0.sum(47925, 5563141);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 6415);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 59102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5611066);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test019"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i22 = testingRandoope0.sum(32, (int)(short)1);
    int i26 = testingRandoope0.sum(13155, 44, 996);
    int i30 = testingRandoope0.sum(562, 1633, 1310);
    int i33 = testingRandoope0.sum(446695, 118919);
    int i37 = testingRandoope0.sum(573889, 1378510, 213538);
    int i40 = testingRandoope0.sum(87825, 216966);
    int i43 = testingRandoope0.sum(8161208, 76946);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 14195);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3505);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 565614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 2165937);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 304791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 8238154);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test020"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i12 = testingRandoope0.sum(545, 451, 0);
    int i15 = testingRandoope0.sum((int)(short)1, 388);
    int i19 = testingRandoope0.sum(1931, 424, 4949);
    int i22 = testingRandoope0.sum(815, 149);
    int i26 = testingRandoope0.sum(839, 269753, 39560);
    int i30 = testingRandoope0.sum(0, 1018278, 97605);
    int i33 = testingRandoope0.sum(195182, 1184349);
    int i36 = testingRandoope0.sum(8619, 1736694);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 389);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 7304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 964);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 310152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1115883);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1379531);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1745313);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test021"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum((int)(short)0, 10);
    int i9 = testingRandoope0.sum(32, (int)(short)100);
    int i12 = testingRandoope0.sum(259, 1);
    int i15 = testingRandoope0.sum(2525, (int)'#');
    int i19 = testingRandoope0.sum(69710, 847, 21403);
    int i23 = testingRandoope0.sum(66087, 1237, 16699);
    int i27 = testingRandoope0.sum(41804, 0, 201284);
    int i31 = testingRandoope0.sum(295850, 57046, 247805);
    int i35 = testingRandoope0.sum(216605, 515975, 25372);
    int i39 = testingRandoope0.sum(0, 939382, 24988);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 91960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 84023);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 243088);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 600701);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 757952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 964370);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test022"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i22 = testingRandoope0.sum(32, (int)(short)1);
    int i25 = testingRandoope0.sum((int)(byte)0, 85);
    int i29 = testingRandoope0.sum(1944, 6524, 1328);
    int i33 = testingRandoope0.sum(747, 777, 1328);
    int i36 = testingRandoope0.sum(51040, 5498);
    int i40 = testingRandoope0.sum(230665, 462753, 5896897);
    int i44 = testingRandoope0.sum(1289046, 3335538, 831599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 9796);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2852);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 56538);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 6590315);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 5456183);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test023"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum(227, 10);
    int i9 = testingRandoope0.sum(590, 564);
    int i13 = testingRandoope0.sum(847, 14868, 4574);
    int i17 = testingRandoope0.sum(81465, 123300, 8773);
    int i20 = testingRandoope0.sum(198371, 2118748);
    int i23 = testingRandoope0.sum(1949142, 842938);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 237);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 20289);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 213538);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2317119);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2792080);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test024"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i23 = testingRandoope0.sum((int)'4', 1599, 247);
    int i26 = testingRandoope0.sum(9654, 23611);
    int i30 = testingRandoope0.sum(15122, 58010, 4729);
    int i33 = testingRandoope0.sum(126812, 23875);
    int i36 = testingRandoope0.sum(5382082, 1946);
    int i40 = testingRandoope0.sum(170017, 1916642, 10575);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 33265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 77861);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 150687);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5384028);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 2097234);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test025"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i12 = testingRandoope0.sum(545, 451, 0);
    int i15 = testingRandoope0.sum(19568, 8749);
    int i18 = testingRandoope0.sum(23489, 20791);
    int i22 = testingRandoope0.sum(58796, 2868, 560);
    int i25 = testingRandoope0.sum(15334, 3224);
    int i28 = testingRandoope0.sum(66199, 414300);
    int i32 = testingRandoope0.sum(8374, 117142, 160329);
    int i36 = testingRandoope0.sum(130886, 487841, 1365763);
    int i40 = testingRandoope0.sum(7817293, 630007, 3487543);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 28317);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 44280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 62224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 18558);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 480499);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 285845);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1984490);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11934843);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test026"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum((int)(short)10, 99);
    int i21 = testingRandoope0.sum(51, 98);
    int i25 = testingRandoope0.sum(33, 649, 2525);
    int i28 = testingRandoope0.sum((int)' ', 51);
    int i32 = testingRandoope0.sum(8514, 93926, 6553);
    int i36 = testingRandoope0.sum(1974, 130523, 5487);
    int i40 = testingRandoope0.sum(65716, 155812, 115932);
    int i43 = testingRandoope0.sum(258496, 46216);
    int i47 = testingRandoope0.sum(193609, 502150, 1058856);
    int i50 = testingRandoope0.sum(1246230, 824488);
    int i53 = testingRandoope0.sum(786108, 2821545);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 108993);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 137984);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 337460);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 304712);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1754615);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 2070718);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 3607653);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test027"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i10 = testingRandoope0.sum((int)(short)1, 0);
    int i13 = testingRandoope0.sum(424, 389);
    int i17 = testingRandoope0.sum(217767, 268275, 443734);
    int i20 = testingRandoope0.sum(17990, 608783);
    int i24 = testingRandoope0.sum(2663732, 12689, 4322910);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 813);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 929776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 626773);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6999331);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test028"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i22 = testingRandoope0.sum(32, (int)(short)1);
    int i25 = testingRandoope0.sum((int)(byte)0, 85);
    int i29 = testingRandoope0.sum(1944, 6524, 1328);
    int i33 = testingRandoope0.sum(747, 777, 1328);
    int i36 = testingRandoope0.sum(45900, 910);
    int i39 = testingRandoope0.sum(247, 2559);
    int i43 = testingRandoope0.sum(19366, 22542, 36253);
    int i47 = testingRandoope0.sum(145288, 2358, 0);
    int i50 = testingRandoope0.sum(6033528, 433018);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 9796);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2852);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 46810);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2806);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 78161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 147646);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 6466546);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test029"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i12 = testingRandoope0.sum(545, 451, 0);
    int i15 = testingRandoope0.sum(19568, 8749);
    int i18 = testingRandoope0.sum(23489, 20791);
    int i22 = testingRandoope0.sum(58796, 2868, 560);
    int i25 = testingRandoope0.sum(15334, 3224);
    int i28 = testingRandoope0.sum(66199, 414300);
    int i31 = testingRandoope0.sum(7473655, 565614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 28317);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 44280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 62224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 18558);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 480499);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 8039269);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test030"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum((int)'4', 85);
    int i17 = testingRandoope0.sum(110, 161);
    int i20 = testingRandoope0.sum(2358, (int)(byte)100);
    int i24 = testingRandoope0.sum(21, (int)(short)100, 3207);
    int i27 = testingRandoope0.sum(17408, 0);
    int i31 = testingRandoope0.sum(799564, 223805, 8749);
    int i34 = testingRandoope0.sum(469841, 91558);
    int i38 = testingRandoope0.sum(4835959, 6156339, 4814900);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2458);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3328);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 17408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1032118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 561399);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 15807198);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test031"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum(576, 654, 98);
    int i19 = testingRandoope0.sum(12606, 40670, 22068);
    int i22 = testingRandoope0.sum(164196, 585904);
    int i25 = testingRandoope0.sum(27650, 780222);
    int i29 = testingRandoope0.sum(753374, 1092398, 857708);
    int i32 = testingRandoope0.sum(3160255, 2776946);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1328);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 75344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 750100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 807872);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2703480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 5937201);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test032"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum(100, 0);
    int i9 = testingRandoope0.sum((-1), (int)(short)100);
    int i12 = testingRandoope0.sum(9, (int)(short)0);
    int i15 = testingRandoope0.sum(10, 217);
    int i18 = testingRandoope0.sum(369, 149);
    int i21 = testingRandoope0.sum(8320, 1362);
    int i24 = testingRandoope0.sum(17137, 0);
    int i28 = testingRandoope0.sum(491985, 3075798, 11362);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 9682);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 17137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 3579145);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test033"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum((int)(short)100, 231);
    int i10 = testingRandoope0.sum(3613, 545, 13939);
    int i13 = testingRandoope0.sum(3619, 9278);
    int i17 = testingRandoope0.sum(1944, 19848, 369);
    int i21 = testingRandoope0.sum(5134, 8435, 69710);
    int i25 = testingRandoope0.sum(6266, 28977, 70053);
    int i29 = testingRandoope0.sum(14782, 262273, 0);
    int i33 = testingRandoope0.sum(4805424, 1261709, 3454273);
    int i37 = testingRandoope0.sum(2250662, 13153287, 3217943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 18097);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 12897);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 22161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 83279);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 105296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 277055);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 9521406);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 18621892);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test034"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i12 = testingRandoope0.sum(545, 451, 0);
    int i15 = testingRandoope0.sum((int)(short)1, 388);
    int i19 = testingRandoope0.sum(518, 356, 1461);
    int i22 = testingRandoope0.sum(2673687, 0);
    int i25 = testingRandoope0.sum(567992, 1584675);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 389);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2335);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2673687);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 2152667);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test035"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum((int)(short)100, 149, 64);
    int i19 = testingRandoope0.sum(340, 11, 298);
    int i22 = testingRandoope0.sum(1420, 614);
    int i26 = testingRandoope0.sum(2431, 2507, 4719);
    int i30 = testingRandoope0.sum(15055, 11593, 12912);
    int i34 = testingRandoope0.sum(158912, 0, 223460);
    int i38 = testingRandoope0.sum(1971024, 1775954, 552249);
    int i42 = testingRandoope0.sum(0, 512366, 2764399);
    int i46 = testingRandoope0.sum(493573, 3699724, 1913965);
    int i50 = testingRandoope0.sum(1464595, 2659629, 708441);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 313);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 649);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2034);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 9657);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 39560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 382372);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 4299227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 3276765);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 6107262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 4832665);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test036"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum((int)(short)100, 231);
    int i9 = testingRandoope0.sum(275401, 252656);
    int i13 = testingRandoope0.sum(69112, 525164, 76560);
    int i16 = testingRandoope0.sum(15320445, 1327727);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 528057);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 670836);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 16648172);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test037"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum(227, 10);
    int i10 = testingRandoope0.sum(1405, 545, 408);
    int i14 = testingRandoope0.sum(9997, 9888, 0);
    int i17 = testingRandoope0.sum(67417, 33322);
    int i21 = testingRandoope0.sum(233458, 140727, 169699);
    int i24 = testingRandoope0.sum(9622, 19044);
    int i28 = testingRandoope0.sum(0, 94164, 45939);
    int i32 = testingRandoope0.sum(893, 15908, 112257);
    int i35 = testingRandoope0.sum(430213, 378878);
    int i38 = testingRandoope0.sum(268990, 1436678);
    int i42 = testingRandoope0.sum(4813337, 73005, 4519747);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 237);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2358);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 19885);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100739);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 543884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 28666);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 140103);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 129058);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 809091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1705668);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 9406089);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test038"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum(100, 0);
    int i9 = testingRandoope0.sum((-1), (int)(short)100);
    int i12 = testingRandoope0.sum(9, (int)(short)0);
    int i15 = testingRandoope0.sum(10, (int)(short)-1);
    int i19 = testingRandoope0.sum(789, 25372, 0);
    int i23 = testingRandoope0.sum(0, 93926, 109);
    int i27 = testingRandoope0.sum(57493, 22079, 916853);
    int i31 = testingRandoope0.sum(11491, 15032, 251302);
    int i35 = testingRandoope0.sum(738893, 20178, 310327);
    int i38 = testingRandoope0.sum(147978, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 26161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 94035);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 996425);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 277825);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1069398);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 147978);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test039"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum(10613, 2034, 1024);
    int i19 = testingRandoope0.sum(583, 78467, 23520);
    int i23 = testingRandoope0.sum(469924, 34330, 1594304);
    int i27 = testingRandoope0.sum(230584, 7057032, 1503225);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 13671);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 102570);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2098558);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 8790841);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test040"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(2458, 21);
    int i28 = testingRandoope0.sum(2933, 5441);
    int i32 = testingRandoope0.sum(7826, 4836, 12228);
    int i35 = testingRandoope0.sum(11361, 105498);
    int i38 = testingRandoope0.sum(23915, 291804);
    int i42 = testingRandoope0.sum(1298591, 1230, 198096);
    int i45 = testingRandoope0.sum(81557, 312413);
    int i49 = testingRandoope0.sum(1849741, 998870, 2616487);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 2479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 8374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 24890);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 116859);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 315719);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1497917);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 393970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 5465098);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test041"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i12 = testingRandoope0.sum(545, 451, 0);
    int i15 = testingRandoope0.sum((int)(byte)1, 3338);
    int i19 = testingRandoope0.sum(823, 557, 3136);
    int i23 = testingRandoope0.sum(996, 5241, 7686);
    int i27 = testingRandoope0.sum(18344, 5706, 21889);
    int i31 = testingRandoope0.sum(92295, 911698, 64748);
    int i34 = testingRandoope0.sum(3305620, 211882);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3339);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4516);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 13923);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 45939);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1068741);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 3517502);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test042"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(149, 98);
    int i18 = testingRandoope0.sum(152, 137, 99);
    int i21 = testingRandoope0.sum(7128, 1617);
    int i25 = testingRandoope0.sum(5795, 5264, 6838);
    int i28 = testingRandoope0.sum(51040, 47160);
    int i32 = testingRandoope0.sum(1505, 18344, 58725);
    int i36 = testingRandoope0.sum(455224, 276175, 68221);
    int i39 = testingRandoope0.sum(23421, 2537);
    int i42 = testingRandoope0.sum(1098478, 836501);
    int i46 = testingRandoope0.sum(970427, 663675, 5269);
    int i49 = testingRandoope0.sum(1062944, 113482);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 388);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8745);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 17897);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 98200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 78574);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 799620);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 25958);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1934979);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1639371);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1176426);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test043"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum((int)'4', (int)(short)-1, (int)(byte)0);
    int i14 = testingRandoope0.sum(100, (int)(byte)-1);
    int i17 = testingRandoope0.sum(1059, 7604);
    int i20 = testingRandoope0.sum(137, (int)(byte)-1);
    int i23 = testingRandoope0.sum(11829, 3136);
    int i27 = testingRandoope0.sum(8619, 66895, 1066278);
    int i31 = testingRandoope0.sum(229422, 108143, 4458010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 8663);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 136);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 14965);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1141792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 4795575);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test044"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum((int)(short)100, 231);
    int i10 = testingRandoope0.sum(3613, 545, 13939);
    int i14 = testingRandoope0.sum(14041, 4988, 3415);
    int i18 = testingRandoope0.sum(101600, 1362452, 557351);
    int i21 = testingRandoope0.sum(227163, 1271733);
    int i25 = testingRandoope0.sum(2466362, 5126016, 9235357);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 18097);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 22444);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2021403);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1498896);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 16827735);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test045"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum((int)'4', (int)(short)-1, (int)(byte)0);
    int i14 = testingRandoope0.sum(100, (int)(byte)-1);
    int i18 = testingRandoope0.sum(407, 182, 1);
    int i22 = testingRandoope0.sum(739, 19, 5290);
    int i25 = testingRandoope0.sum(4266, 323);
    int i28 = testingRandoope0.sum(18363, 2771);
    int i32 = testingRandoope0.sum(4250, 376, 18920);
    int i36 = testingRandoope0.sum(191932, 4057, 4836);
    int i40 = testingRandoope0.sum(67021, 11124, 58865);
    int i43 = testingRandoope0.sum(51677, 5705);
    int i47 = testingRandoope0.sum(1058239, 116004, 44415);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 590);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 6048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 4589);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 21134);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 23546);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 200825);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 137010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 57382);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1218658);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test046"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum((int)(short)10, 99);
    int i21 = testingRandoope0.sum(51, 98);
    int i25 = testingRandoope0.sum(33, 649, 2525);
    int i29 = testingRandoope0.sum(5858, 130, 51);
    int i32 = testingRandoope0.sum(217, 1902);
    int i35 = testingRandoope0.sum(32925, 62262);
    int i38 = testingRandoope0.sum(89183, 459526);
    int i42 = testingRandoope0.sum(2010181, 8383, 1946410);
    int i46 = testingRandoope0.sum(1189970, 331978, 832412);
    int i49 = testingRandoope0.sum(0, 776021);
    int i52 = testingRandoope0.sum(6458545, 1830013);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 6039);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 2119);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 95187);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 548709);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 3964974);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 2354360);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 776021);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 8288558);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test047"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i12 = testingRandoope0.sum(545, 451, 0);
    int i15 = testingRandoope0.sum(19568, 8749);
    int i18 = testingRandoope0.sum(23489, 20791);
    int i22 = testingRandoope0.sum(58796, 2868, 560);
    int i25 = testingRandoope0.sum(705070, 28969);
    int i29 = testingRandoope0.sum(101941, 21512, 984729);
    int i32 = testingRandoope0.sum(294783, 146021);
    int i35 = testingRandoope0.sum(1569365, 3027164);
    int i38 = testingRandoope0.sum(995629, 4896381);
    int i41 = testingRandoope0.sum(2611003, 870275);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 996);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 28317);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 44280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 62224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 734039);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1108182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 440804);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 4596529);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 5892010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 3481278);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test048"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(149, 98);
    int i17 = testingRandoope0.sum(11721, 26281);
    int i20 = testingRandoope0.sum(393051, 1041178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 38002);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1434229);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test049"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(747, 359);
    int i22 = testingRandoope0.sum(182, 5705, 4057);
    int i25 = testingRandoope0.sum(28788, 19033);
    int i29 = testingRandoope0.sum(2743, 46076, 0);
    int i33 = testingRandoope0.sum(32926, 293847, 226423);
    int i37 = testingRandoope0.sum(1103863, 41728, 1300227);
    int i40 = testingRandoope0.sum(2618168, 3965);
    int i43 = testingRandoope0.sum(105523, 961218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 9944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 47821);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 48819);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 553196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 2445818);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 2622133);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1066741);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test050"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum((int)(short)10, 99);
    int i21 = testingRandoope0.sum(51, 98);
    int i25 = testingRandoope0.sum(33, 649, 2525);
    int i28 = testingRandoope0.sum((int)' ', 51);
    int i31 = testingRandoope0.sum(683, 227);
    int i34 = testingRandoope0.sum(215, 0);
    int i38 = testingRandoope0.sum(3207, 5264, 323);
    int i42 = testingRandoope0.sum(13155, 137, 486);
    int i46 = testingRandoope0.sum(332, 977, 831);
    int i49 = testingRandoope0.sum(6266, 38907);
    int i52 = testingRandoope0.sum(1517083, 23341);
    int i55 = testingRandoope0.sum(21134, 88341);
    int i58 = testingRandoope0.sum(255728, 27676);
    int i61 = testingRandoope0.sum(5004173, 362445);
    int i65 = testingRandoope0.sum(5993582, 783869, 186024);
    int i68 = testingRandoope0.sum(1378101, 5032519);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 910);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 215);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 8794);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 13778);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 2140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 45173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1540424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 109475);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 283404);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 5366618);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 6963475);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 6410620);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test051"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(576, 247);
    int i28 = testingRandoope0.sum((int)(byte)1, 160);
    int i31 = testingRandoope0.sum(581, 32);
    int i35 = testingRandoope0.sum(150, (int)'a', (int)(byte)100);
    int i38 = testingRandoope0.sum(5134, 5492);
    int i42 = testingRandoope0.sum(7206, 3695, 10626);
    int i46 = testingRandoope0.sum(53015, 5685, 5487);
    int i50 = testingRandoope0.sum(39015, 6587, 57046);
    int i53 = testingRandoope0.sum(167502, 53651);
    int i56 = testingRandoope0.sum(439024, 354926);
    int i60 = testingRandoope0.sum(548277, 1253260, 313412);
    int i63 = testingRandoope0.sum(491509, 1452909);
    int i66 = testingRandoope0.sum(2364545, 1166314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 10626);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 21527);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 64187);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 102648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 221153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 793950);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 2114949);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1944418);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 3530859);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test052"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(576, 247);
    int i28 = testingRandoope0.sum((int)(byte)1, 160);
    int i31 = testingRandoope0.sum(581, 32);
    int i34 = testingRandoope0.sum(2525, (int)(short)10);
    int i37 = testingRandoope0.sum(546122, 2397694);
    int i41 = testingRandoope0.sum(4255120, 234445, 2758);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 2535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 2943816);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 4492323);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test053"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)' ', (int)'#', 150);
    int i12 = testingRandoope0.sum(100, 60, 109);
    int i16 = testingRandoope0.sum(101, 33, 430);
    int i20 = testingRandoope0.sum(1974, 545, 2358);
    int i24 = testingRandoope0.sum(5858, 2363, 17948);
    int i27 = testingRandoope0.sum(106453, 359940);
    int i31 = testingRandoope0.sum(158240, 961273, 0);
    int i35 = testingRandoope0.sum(4339012, 4997280, 3966498);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 564);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 4877);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 26169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 466393);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1119513);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 13302790);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test054"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum((int)'4', (int)(short)-1, (int)(byte)0);
    int i14 = testingRandoope0.sum(100, (int)(byte)-1);
    int i18 = testingRandoope0.sum(407, 182, 1);
    int i22 = testingRandoope0.sum(739, 19, 5290);
    int i25 = testingRandoope0.sum(4266, 323);
    int i28 = testingRandoope0.sum(18363, 2771);
    int i31 = testingRandoope0.sum(57327, 32737);
    int i35 = testingRandoope0.sum(146786, 80283, 1891679);
    int i39 = testingRandoope0.sum(1662592, 309287, 0);
    int i43 = testingRandoope0.sum(764284, 4396136, 461877);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 590);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 6048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 4589);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 21134);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 90064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 2118748);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1971879);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 5622297);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test055"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum((int)(short)10, 99);
    int i21 = testingRandoope0.sum(51, 98);
    int i25 = testingRandoope0.sum(33, 649, 2525);
    int i29 = testingRandoope0.sum(5858, 130, 51);
    int i32 = testingRandoope0.sum(217, 1902);
    int i35 = testingRandoope0.sum(17897, 3992);
    int i39 = testingRandoope0.sum(6276485, 599289, 0);
    int i42 = testingRandoope0.sum(1041178, 1371843);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 6039);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 2119);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 21889);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 6875774);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 2413021);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test056"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum((int)(short)0, 10);
    int i9 = testingRandoope0.sum((int)'4', 98);
    int i12 = testingRandoope0.sum(99, 132);
    int i15 = testingRandoope0.sum(214, 130);
    int i18 = testingRandoope0.sum(108574, 248092);
    int i22 = testingRandoope0.sum(1806604, 247059, 2528000);
    int i26 = testingRandoope0.sum(1860119, 1442899, 3052359);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 231);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 356666);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 4581663);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 6355377);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test057"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i22 = testingRandoope0.sum(32, (int)(short)1);
    int i26 = testingRandoope0.sum(13155, 44, 996);
    int i29 = testingRandoope0.sum(408, 616);
    int i33 = testingRandoope0.sum(0, 94266, 359);
    int i36 = testingRandoope0.sum(118754, 14049);
    int i39 = testingRandoope0.sum(18363, 368465);
    int i42 = testingRandoope0.sum(5788696, 267620);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 14195);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 94625);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 132803);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 386828);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 6056316);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test058"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum(100, 0);
    int i10 = testingRandoope0.sum((int)' ', 0, (int)(short)0);
    int i13 = testingRandoope0.sum(98, (int)' ');
    int i17 = testingRandoope0.sum((int)(byte)10, 1, 10);
    int i21 = testingRandoope0.sum(11, (int)(byte)100, 313);
    int i25 = testingRandoope0.sum(140547, 147978, 74947);
    int i29 = testingRandoope0.sum(104005, 446591, 2033951);
    int i32 = testingRandoope0.sum(5419584, 2735887);
    int i36 = testingRandoope0.sum(438137, 80974, 1395643);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 363472);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2584547);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 8155471);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1914754);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test059"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i22 = testingRandoope0.sum(32, (int)(short)1);
    int i25 = testingRandoope0.sum((int)(byte)0, 85);
    int i28 = testingRandoope0.sum(21424, 1405);
    int i31 = testingRandoope0.sum(21495, 2211);
    int i35 = testingRandoope0.sum(20289, 17480, 67729);
    int i39 = testingRandoope0.sum(945, 407, 45192);
    int i42 = testingRandoope0.sum(996121, 1706752);
    int i46 = testingRandoope0.sum(282109, 853841, 53093);
    int i49 = testingRandoope0.sum(106550, 1274328);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 22829);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 23706);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 105498);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 46544);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 2702873);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1189043);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1380878);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test060"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(149, 98);
    int i18 = testingRandoope0.sum(407, 1, 407);
    int i22 = testingRandoope0.sum(356, 996, 247);
    int i26 = testingRandoope0.sum(313, 1307, 1999);
    int i30 = testingRandoope0.sum(10316875, 235098, 3212782);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 815);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 3619);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 13764755);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test061"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(130, 451);
    int i28 = testingRandoope0.sum(152, 1116);
    int i31 = testingRandoope0.sum(182, 7128);
    int i35 = testingRandoope0.sum(5705, 0, (int)(short)1);
    int i39 = testingRandoope0.sum(83895, 31323, 27227);
    int i43 = testingRandoope0.sum(548092, 118335, 621864);
    int i46 = testingRandoope0.sum(1664967, 2975723);
    int i49 = testingRandoope0.sum(3506905, 1552280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 7310);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 5706);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 142445);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1288291);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4640690);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 5059185);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test062"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum((int)(short)100, 231);
    int i10 = testingRandoope0.sum(3613, 545, 13939);
    int i13 = testingRandoope0.sum(3619, 9278);
    int i17 = testingRandoope0.sum(1944, 19848, 369);
    int i20 = testingRandoope0.sum(112688, 0);
    int i24 = testingRandoope0.sum(1489, 315, 5070);
    int i28 = testingRandoope0.sum(31736, 21134, 46025);
    int i31 = testingRandoope0.sum(10221, 39012);
    int i34 = testingRandoope0.sum(1010961, 994094);
    int i38 = testingRandoope0.sum(1195215, 8363904, 11506877);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 18097);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 12897);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 22161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 112688);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6874);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 98895);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 49233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 2005055);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 21065996);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test063"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(149, 98);
    int i18 = testingRandoope0.sum(152, 137, 99);
    int i22 = testingRandoope0.sum(1246, 5858, 1311);
    int i25 = testingRandoope0.sum(1461, 2806);
    int i29 = testingRandoope0.sum(132308, 185231, 89384);
    int i33 = testingRandoope0.sum(128136, 110084, 1529939);
    int i37 = testingRandoope0.sum(2092943, 2128394, 4422776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 388);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 8415);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 4267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 406923);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1768159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 8644113);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test064"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(149, 98);
    int i18 = testingRandoope0.sum(152, 137, 99);
    int i22 = testingRandoope0.sum(45, 33, 237);
    int i25 = testingRandoope0.sum(7645, 8693);
    int i29 = testingRandoope0.sum(19501, 136512, 50260);
    int i32 = testingRandoope0.sum(10357, 123789);
    int i35 = testingRandoope0.sum(550274, 117142);
    int i38 = testingRandoope0.sum(1617, 1921982);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 388);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 315);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 16338);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 206273);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 134146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 667416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1923599);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test065"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum((int)(short)100, 149, 64);
    int i18 = testingRandoope0.sum(14189, 162);
    int i22 = testingRandoope0.sum(423460, 1295196, 809344);
    int i25 = testingRandoope0.sum(350864, 2099);
    int i28 = testingRandoope0.sum(144957, 592169);
    int i31 = testingRandoope0.sum(307667, 238429);
    int i34 = testingRandoope0.sum(2278550, 1377821);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 313);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 14351);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2528000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 352963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 737126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 546096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 3656371);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test066"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(130, 451);
    int i28 = testingRandoope0.sum(152, 1116);
    int i31 = testingRandoope0.sum(2560, 1405);
    int i34 = testingRandoope0.sum(117, 0);
    int i38 = testingRandoope0.sum(697, 1974, 0);
    int i41 = testingRandoope0.sum(137368, 59255);
    int i44 = testingRandoope0.sum(36862, 211256);
    int i47 = testingRandoope0.sum(1968764, 2563574);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 3965);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 2671);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 196623);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 248118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 4532338);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test067"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(576, 247);
    int i29 = testingRandoope0.sum(568, 5131, 7752);
    int i32 = testingRandoope0.sum(2645, 269);
    int i35 = testingRandoope0.sum(313, 4290);
    int i39 = testingRandoope0.sum(3676827, 290987, 3300721);
    int i43 = testingRandoope0.sum(0, 375670, 62208);
    int i47 = testingRandoope0.sum(140989, 177759, 232824);
    int i51 = testingRandoope0.sum(38694, 8971265, 2569517);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 13451);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 2914);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 4603);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 7268535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 437878);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 551572);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 11579476);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test068"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i7 = testingRandoope0.sum((int)(short)1, 99, (int)(short)1);
    int i11 = testingRandoope0.sum(430, 0, 576);
    int i14 = testingRandoope0.sum(407, 44);
    int i17 = testingRandoope0.sum(369, 182);
    int i21 = testingRandoope0.sum(247, 369, 557);
    int i25 = testingRandoope0.sum((int)(short)0, 388, (int)(byte)100);
    int i29 = testingRandoope0.sum(217, 2458, 29219);
    int i32 = testingRandoope0.sum(0, 247);
    int i36 = testingRandoope0.sum(670, 26401, 41066);
    int i39 = testingRandoope0.sum(64123, 97140);
    int i43 = testingRandoope0.sum(550044, 869515, 28139);
    int i46 = testingRandoope0.sum(698964, 2526);
    int i50 = testingRandoope0.sum(4144573, 60956, 3579488);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1006);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 451);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 551);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 488);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 31894);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 68137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 161263);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1447698);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 701490);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 7785017);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test069"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)1, (int)(byte)10);
    int i14 = testingRandoope0.sum(2458, 2915);
    int i17 = testingRandoope0.sum(0, 0);
    int i21 = testingRandoope0.sum(5241, 2852, 0);
    int i25 = testingRandoope0.sum(4305, 3415, 30107);
    int i29 = testingRandoope0.sum(8139, 21058, 29050);
    int i32 = testingRandoope0.sum(24366, 0);
    int i35 = testingRandoope0.sum(365845, 211670);
    int i38 = testingRandoope0.sum(5273588, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5373);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8093);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 37827);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 58247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 24366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 577515);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 5273588);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test070"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)' ', (int)'#', 150);
    int i12 = testingRandoope0.sum(100, 60, 109);
    int i16 = testingRandoope0.sum(109, 101, 130);
    int i19 = testingRandoope0.sum(132, 430);
    int i22 = testingRandoope0.sum(654, (int)(short)1);
    int i25 = testingRandoope0.sum(340, 789);
    int i28 = testingRandoope0.sum(17131, 2458);
    int i31 = testingRandoope0.sum(61527, 12116);
    int i35 = testingRandoope0.sum(193716, 1706090, 13053890);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 562);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 655);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1129);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 19589);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 73643);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 14953696);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test071"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(130, 451);
    int i28 = testingRandoope0.sum(152, 1116);
    int i31 = testingRandoope0.sum(977, 1599);
    int i34 = testingRandoope0.sum(278876, 568);
    int i37 = testingRandoope0.sum(515549, 80210);
    int i40 = testingRandoope0.sum(2251335, 662174);
    int i43 = testingRandoope0.sum(1051286, 75110);
    int i46 = testingRandoope0.sum(965044, 1130889);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 279444);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 595759);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 2913509);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1126396);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 2095933);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test072"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)' ', (int)'#', 150);
    int i12 = testingRandoope0.sum(100, 60, 109);
    int i16 = testingRandoope0.sum(101, 33, 430);
    int i20 = testingRandoope0.sum(152, 331, 3992);
    int i23 = testingRandoope0.sum(0, 8745);
    int i27 = testingRandoope0.sum((int)(byte)-1, 6048, 1570);
    int i30 = testingRandoope0.sum(97, 1025);
    int i34 = testingRandoope0.sum(210317, 3868073, 1223720);
    int i38 = testingRandoope0.sum(2018659, 3250145, 13675);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 564);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 4475);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 8745);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7617);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 5302110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 5282479);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test073"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum(45, 150, 149);
    int i18 = testingRandoope0.sum(30038, (-1));
    int i22 = testingRandoope0.sum(1257, 1292, 167502);
    int i25 = testingRandoope0.sum(153825, 4283);
    int i29 = testingRandoope0.sum(151016, 407, 129695);
    int i32 = testingRandoope0.sum(1517083, 10626);
    int i36 = testingRandoope0.sum(2137292, 26266, 6233275);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 30037);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 170051);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 158108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 281118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1527709);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 8396833);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test074"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i10 = testingRandoope0.sum((int)(short)1, 0);
    int i13 = testingRandoope0.sum((int)'#', 10);
    int i17 = testingRandoope0.sum(369, 1461, (int)(short)1);
    int i20 = testingRandoope0.sum(3265, 934);
    int i23 = testingRandoope0.sum(5646, 4929);
    int i27 = testingRandoope0.sum(990, 577216, 293514);
    int i30 = testingRandoope0.sum(41680, 111877);
    int i33 = testingRandoope0.sum(4463356, 2107523);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 4199);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 10575);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 871720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 153557);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 6570879);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test075"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)' ', (int)'#', 150);
    int i12 = testingRandoope0.sum(100, 60, 109);
    int i16 = testingRandoope0.sum(109, 101, 130);
    int i20 = testingRandoope0.sum(2413, 8749, 5027);
    int i23 = testingRandoope0.sum(11496, 135683);
    int i27 = testingRandoope0.sum(2079149, 1066741, 1548487);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 16189);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 147179);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4694377);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test076"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum((int)(short)10, 99);
    int i21 = testingRandoope0.sum(51, 98);
    int i25 = testingRandoope0.sum(33, 649, 2525);
    int i29 = testingRandoope0.sum(1617, 0, 1154);
    int i33 = testingRandoope0.sum(137, 21527, 8374);
    int i37 = testingRandoope0.sum(35602, 45939, 215000);
    int i41 = testingRandoope0.sum(4364483, 2971928, 16789);
    int i45 = testingRandoope0.sum(1281784, 1296281, 878341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2771);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 30038);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 296541);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 7353200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 3456406);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test077"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)' ', (int)'#', 150);
    int i12 = testingRandoope0.sum(100, 60, 109);
    int i16 = testingRandoope0.sum(109, 101, 130);
    int i19 = testingRandoope0.sum(132, 430);
    int i22 = testingRandoope0.sum(654, (int)(short)1);
    int i25 = testingRandoope0.sum(340, 789);
    int i28 = testingRandoope0.sum(110, 2016);
    int i31 = testingRandoope0.sum(12912, 6587);
    int i35 = testingRandoope0.sum(10329, 7581, 48804);
    int i39 = testingRandoope0.sum(162, 2099, 25495);
    int i42 = testingRandoope0.sum(2033, 39508);
    int i46 = testingRandoope0.sum(335, 11022, 560);
    int i50 = testingRandoope0.sum(176455, 10645, 43565);
    int i54 = testingRandoope0.sum(431376, 565614, 216782);
    int i58 = testingRandoope0.sum(877372, 8514, 3606962);
    int i61 = testingRandoope0.sum(0, 662830);
    int i65 = testingRandoope0.sum(1020366, 343393, 1869000);
    int i69 = testingRandoope0.sum(0, 328594, 1385293);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 562);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 655);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1129);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 2126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 19499);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 66714);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 27756);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 41541);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 11917);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 230665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1213772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 4492848);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 662830);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 3232759);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1713887);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test078"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum((int)(short)0, 10);
    int i9 = testingRandoope0.sum(32, (int)(short)100);
    int i12 = testingRandoope0.sum(259, 1);
    int i15 = testingRandoope0.sum(1248, 260);
    int i19 = testingRandoope0.sum(22542, 108, 839);
    int i23 = testingRandoope0.sum(10921, 18406, 135037);
    int i26 = testingRandoope0.sum(56132, 26642);
    int i30 = testingRandoope0.sum(11974231, 762750, 4926216);
    int i34 = testingRandoope0.sum(198366, 196452, 1428656);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1508);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 23489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 164364);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 82774);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 17663197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1823474);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test079"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum(1, (int)(short)-1);
    int i6 = testingRandoope0.sum(150, 32);
    int i10 = testingRandoope0.sum(407, 340, (int)(short)0);
    int i13 = testingRandoope0.sum(530, 259);
    int i16 = testingRandoope0.sum(1420, 501);
    int i20 = testingRandoope0.sum(227, 22623, 11);
    int i24 = testingRandoope0.sum(23706, 2806, 50478);
    int i27 = testingRandoope0.sum(574252, 355870);
    int i30 = testingRandoope0.sum(2916558, 2521621);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 747);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 789);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 22861);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 76990);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 930122);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5438179);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test080"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(149, 98);
    int i18 = testingRandoope0.sum(152, 137, 99);
    int i21 = testingRandoope0.sum(7128, 1617);
    int i24 = testingRandoope0.sum(45053, 103593);
    int i27 = testingRandoope0.sum(28403, 118122);
    int i31 = testingRandoope0.sum(5530199, 2774279, 1282242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 388);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8745);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 148646);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 146525);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 9586720);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test081"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(130, 451);
    int i28 = testingRandoope0.sum(152, 1116);
    int i31 = testingRandoope0.sum(2560, 1405);
    int i34 = testingRandoope0.sum(117, 0);
    int i37 = testingRandoope0.sum((int)(short)100, (int)(short)10);
    int i40 = testingRandoope0.sum(581, 214);
    int i44 = testingRandoope0.sum(1123, 1617, 632);
    int i48 = testingRandoope0.sum(990, 32, 977);
    int i51 = testingRandoope0.sum(50422, 2131);
    int i55 = testingRandoope0.sum(108514, 33444, 11867);
    int i59 = testingRandoope0.sum(96249, 29456, 54946);
    int i63 = testingRandoope0.sum(202747, 22161, 97794);
    int i67 = testingRandoope0.sum(572508, 81647, 78172);
    int i71 = testingRandoope0.sum(257816, 440387, 2901);
    int i74 = testingRandoope0.sum(34042, 702942);
    int i78 = testingRandoope0.sum(7013988, 810026, 543720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 3965);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 795);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 3372);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 52553);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 153825);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 180651);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 322702);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 732327);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 701104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 736984);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 8367734);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test082"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(576, 247);
    int i28 = testingRandoope0.sum((int)(byte)1, 160);
    int i31 = testingRandoope0.sum(581, 32);
    int i35 = testingRandoope0.sum(150, (int)'a', (int)(byte)100);
    int i38 = testingRandoope0.sum(2034, 2915);
    int i41 = testingRandoope0.sum(1362, 1405);
    int i44 = testingRandoope0.sum(26169, 10626);
    int i48 = testingRandoope0.sum(2902217, 12018571, 982789);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 4949);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 2767);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 36795);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 15903577);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test083"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum(227, 10);
    int i10 = testingRandoope0.sum(1405, 545, 408);
    int i14 = testingRandoope0.sum(9997, 9888, 0);
    int i17 = testingRandoope0.sum(12826, 28579);
    int i20 = testingRandoope0.sum(18933, 499253);
    int i23 = testingRandoope0.sum(1114570, 0);
    int i26 = testingRandoope0.sum(456015, 5007531);
    int i29 = testingRandoope0.sum(520742, 130523);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 237);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2358);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 19885);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 41405);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 518186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1114570);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 5463546);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 651265);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test084"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum((int)(short)10, 99);
    int i21 = testingRandoope0.sum(51, 98);
    int i25 = testingRandoope0.sum(33, 649, 2525);
    int i29 = testingRandoope0.sum(1617, 0, 1154);
    int i33 = testingRandoope0.sum(137, 21527, 8374);
    int i37 = testingRandoope0.sum(75803, 34670, 0);
    int i40 = testingRandoope0.sum(3505007, 7811489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2771);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 30038);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 110473);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11316496);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test085"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum(1, (int)(short)-1);
    int i6 = testingRandoope0.sum(150, 32);
    int i9 = testingRandoope0.sum(3695, 9657);
    int i12 = testingRandoope0.sum(31409, 439);
    int i15 = testingRandoope0.sum(283534, 3015);
    int i18 = testingRandoope0.sum(414363, 297435);
    int i22 = testingRandoope0.sum(967233, 1482522, 2323899);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 13352);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 31848);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 286549);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 711798);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 4773654);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test086"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum(45, 150, 149);
    int i19 = testingRandoope0.sum(484, 1129, (int)'#');
    int i23 = testingRandoope0.sum(17948, 6741, 160);
    int i27 = testingRandoope0.sum(13414, 9, 4589);
    int i30 = testingRandoope0.sum(1831, 0);
    int i33 = testingRandoope0.sum(3069, 13356);
    int i37 = testingRandoope0.sum(13057, 24527, 1570);
    int i40 = testingRandoope0.sum(63824, 19596);
    int i44 = testingRandoope0.sum(421480, 52222, 9848);
    int i47 = testingRandoope0.sum(295168, 51931);
    int i50 = testingRandoope0.sum(1975327, 458379);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 24849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 18012);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 16425);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 39154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 83420);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 483550);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 347099);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 2433706);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test087"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum(45, 150, 149);
    int i19 = testingRandoope0.sum(65015, 5160, 3965);
    int i23 = testingRandoope0.sum(64123, 512366, 833963);
    int i27 = testingRandoope0.sum(455773, 45038, 3306952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 74140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1410452);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3807763);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test088"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum((int)(short)10, 99);
    int i21 = testingRandoope0.sum(51, 98);
    int i25 = testingRandoope0.sum(33, 649, 2525);
    int i28 = testingRandoope0.sum((int)' ', 51);
    int i31 = testingRandoope0.sum(683, 227);
    int i34 = testingRandoope0.sum(313, (int)(short)10);
    int i37 = testingRandoope0.sum(3806, 0);
    int i41 = testingRandoope0.sum(0, 16189, 293589);
    int i44 = testingRandoope0.sum(887994, 292529);
    int i48 = testingRandoope0.sum(1276926, 0, 1118776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 3207);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 910);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 323);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 3806);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 309778);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1180523);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 2395702);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test089"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum((int)'4', 85);
    int i17 = testingRandoope0.sum(110, 161);
    int i20 = testingRandoope0.sum(2358, (int)(byte)100);
    int i24 = testingRandoope0.sum(21, (int)(short)100, 3207);
    int i27 = testingRandoope0.sum(8644, 78086);
    int i31 = testingRandoope0.sum(11971, 192466, 22726);
    int i35 = testingRandoope0.sum(1316094, 216508, 191433);
    int i39 = testingRandoope0.sum(4718015, 5013337, 362631);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2458);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3328);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 86730);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 227163);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1724035);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 10093983);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test090"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i7 = testingRandoope0.sum((int)(short)1, 99, (int)(short)1);
    int i11 = testingRandoope0.sum(430, 0, 576);
    int i14 = testingRandoope0.sum(407, 44);
    int i17 = testingRandoope0.sum(369, 182);
    int i21 = testingRandoope0.sum(1945, 6009, 6914);
    int i24 = testingRandoope0.sum(9896, 19665);
    int i28 = testingRandoope0.sum(26366, 424, 19885);
    int i32 = testingRandoope0.sum(113017, 118498, 4566);
    int i35 = testingRandoope0.sum(61904, 458069);
    int i39 = testingRandoope0.sum(358211, 215000, 859249);
    int i42 = testingRandoope0.sum(510592, 823433);
    int i46 = testingRandoope0.sum(0, 3897345, 890970);
    int i50 = testingRandoope0.sum(10590343, 2351360, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1006);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 451);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 551);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 14868);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 29561);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 46675);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 236081);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 519973);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1432460);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1334025);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4788315);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 12941703);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test091"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum((int)'4', (int)(short)-1, (int)(byte)0);
    int i14 = testingRandoope0.sum(100, (int)(byte)-1);
    int i18 = testingRandoope0.sum(407, 182, 1);
    int i22 = testingRandoope0.sum(739, 19, 5290);
    int i25 = testingRandoope0.sum(4266, 323);
    int i28 = testingRandoope0.sum(2537, 113571);
    int i31 = testingRandoope0.sum(115915, 557466);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 590);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 6048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 4589);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 116108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 673381);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test092"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(130, 451);
    int i28 = testingRandoope0.sum(152, 1116);
    int i31 = testingRandoope0.sum(2560, 1405);
    int i35 = testingRandoope0.sum(777, 1246, (int)(byte)10);
    int i38 = testingRandoope0.sum(2120, 3642);
    int i42 = testingRandoope0.sum(83603, 493164, 529273);
    int i46 = testingRandoope0.sum(1010473, 2023668, 1110739);
    int i49 = testingRandoope0.sum(51205, 2569614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 3965);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 2033);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 5762);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1106040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4144880);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 2620819);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test093"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum((int)(short)10, 99);
    int i21 = testingRandoope0.sum(6730, 1737);
    int i25 = testingRandoope0.sum(91707, 34328, 265968);
    int i28 = testingRandoope0.sum(2120, 205252);
    int i32 = testingRandoope0.sum(1048428, 85431, 217933);
    int i35 = testingRandoope0.sum(161607, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8467);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 392003);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 207372);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1351792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 161607);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test094"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i12 = testingRandoope0.sum(150, 10, (int)(byte)0);
    int i15 = testingRandoope0.sum(407, 150);
    int i19 = testingRandoope0.sum(0, 7752, 5662);
    int i23 = testingRandoope0.sum(1123, 839, 545);
    int i26 = testingRandoope0.sum(22151, 7304);
    int i30 = testingRandoope0.sum(831, 4447, 114198);
    int i34 = testingRandoope0.sum(339163, 52532, 3328);
    int i37 = testingRandoope0.sum(322175, 355291);
    int i40 = testingRandoope0.sum(1718615, 133080);
    int i43 = testingRandoope0.sum(417343, 130122);
    int i47 = testingRandoope0.sum(1392508, 3897567, 321582);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 557);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 13414);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2507);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 29455);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 119476);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 395023);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 677466);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1851695);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 547465);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 5611657);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test095"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(576, 247);
    int i28 = testingRandoope0.sum((int)(byte)1, 160);
    int i32 = testingRandoope0.sum(35109, 16782, 152);
    int i36 = testingRandoope0.sum(51659, 29050, 22079);
    int i39 = testingRandoope0.sum(96045, 98598);
    int i42 = testingRandoope0.sum(1748397, 0);
    int i46 = testingRandoope0.sum(1163433, 1564744, 2052838);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 52043);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 102788);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 194643);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1748397);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4781015);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test096"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i7 = testingRandoope0.sum((int)(short)1, 99, (int)(short)1);
    int i11 = testingRandoope0.sum(430, 0, 576);
    int i14 = testingRandoope0.sum(407, 44);
    int i17 = testingRandoope0.sum(369, 182);
    int i21 = testingRandoope0.sum(2924, 2358, 576);
    int i25 = testingRandoope0.sum(8383, 344, 1909);
    int i29 = testingRandoope0.sum(11138, 19740, 356);
    int i33 = testingRandoope0.sum(29875, 9797, 7308);
    int i36 = testingRandoope0.sum(70584, 47821);
    int i40 = testingRandoope0.sum(40632, 36764, 170696);
    int i44 = testingRandoope0.sum(782601, 5378179, 3667913);
    int i47 = testingRandoope0.sum(15211230, 4950287);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1006);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 451);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 551);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5858);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10636);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 31234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 46980);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 118405);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 248092);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 9828693);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 20161517);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test097"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum(45, 150, 149);
    int i19 = testingRandoope0.sum(484, 1129, (int)'#');
    int i23 = testingRandoope0.sum(17948, 6741, 160);
    int i27 = testingRandoope0.sum(8514, (-1), 15558);
    int i31 = testingRandoope0.sum(1081006, 1201274, 1021666);
    int i34 = testingRandoope0.sum(104254, 1735160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 24849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 24071);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 3303946);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1839414);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test098"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(149, 98);
    int i18 = testingRandoope0.sum(407, 1, 407);
    int i22 = testingRandoope0.sum(356, 996, 247);
    int i26 = testingRandoope0.sum(313, 1307, 1999);
    int i29 = testingRandoope0.sum(9997, 45192);
    int i33 = testingRandoope0.sum(9990, 3651, 2914);
    int i36 = testingRandoope0.sum(79134, 16040);
    int i39 = testingRandoope0.sum(417343, 677466);
    int i42 = testingRandoope0.sum(1736579, 7127289);
    int i46 = testingRandoope0.sum(1416471, 753540, 1360034);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 815);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 3619);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 55189);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 16555);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 95174);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1094809);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 8863868);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 3530045);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test099"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(0, 313);
    int i18 = testingRandoope0.sum(545, 10, 99);
    int i22 = testingRandoope0.sum(0, 18363, 2335);
    int i25 = testingRandoope0.sum(56234, 8514);
    int i29 = testingRandoope0.sum(52502, 147046, 204112);
    int i33 = testingRandoope0.sum(230091, 637011, 48562);
    int i36 = testingRandoope0.sum(8066, 575301);
    int i39 = testingRandoope0.sum(2113, 1387153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 313);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 654);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 20698);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 64748);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 403660);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 915664);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 583367);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1389266);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test100"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i12 = testingRandoope0.sum(150, 10, (int)(byte)0);
    int i16 = testingRandoope0.sum(44, 683, 369);
    int i19 = testingRandoope0.sum(488, 13451);
    int i23 = testingRandoope0.sum(7752, 1353, 1508);
    int i27 = testingRandoope0.sum(84930, 14134, 8565);
    int i30 = testingRandoope0.sum(77597, 59856);
    int i34 = testingRandoope0.sum(205253, 348669, 25781);
    int i38 = testingRandoope0.sum(5307580, 673359, 4108694);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 13939);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 10613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 107629);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 137453);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 579703);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 10089633);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test101"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, (int)(byte)1, 557);
    int i25 = testingRandoope0.sum(1246, 697);
    int i28 = testingRandoope0.sum(1179255, 798582);
    int i31 = testingRandoope0.sum(9757019, 2258183);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 658);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1977837);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 12015202);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test102"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i23 = testingRandoope0.sum(227, 60, 44);
    int i26 = testingRandoope0.sum(551, 439);
    int i30 = testingRandoope0.sum(551, 331, 137);
    int i34 = testingRandoope0.sum(562, 120594, 2144);
    int i37 = testingRandoope0.sum(1146, 985);
    int i40 = testingRandoope0.sum(9748, 31425);
    int i43 = testingRandoope0.sum(10645, 139959);
    int i47 = testingRandoope0.sum(93032, 6943, 62224);
    int i51 = testingRandoope0.sum(1909059, 91770, 486516);
    int i55 = testingRandoope0.sum(6574223, 97945, 2342038);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 331);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 990);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1019);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 123300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 2131);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 41173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 150604);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 162199);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 2487345);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 9014206);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test103"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i22 = testingRandoope0.sum(32, (int)(short)1);
    int i25 = testingRandoope0.sum(161, 592);
    int i29 = testingRandoope0.sum(134349, 22114, 181044);
    int i33 = testingRandoope0.sum(92518, 21889, 154670);
    int i36 = testingRandoope0.sum(523230, 760202);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 753);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 337507);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 269077);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1283432);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test104"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)1, (int)(byte)10);
    int i15 = testingRandoope0.sum(2525, 344, 2956);
    int i18 = testingRandoope0.sum(6370, 7604);
    int i21 = testingRandoope0.sum(23885, 67336);
    int i24 = testingRandoope0.sum(59139, (int)(byte)-1);
    int i28 = testingRandoope0.sum(8312, 99374, 38861);
    int i32 = testingRandoope0.sum(507156, 342934, 914216);
    int i36 = testingRandoope0.sum(207881, 113318, 85423);
    int i40 = testingRandoope0.sum(0, 0, 1878833);
    int i43 = testingRandoope0.sum(365595, 707651);
    int i46 = testingRandoope0.sum(8833549, 102853);
    int i49 = testingRandoope0.sum(3999118, 2042288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 5825);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 13974);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 91221);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 59138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 146547);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1764306);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 406622);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1878833);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1073246);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 8936402);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 6041406);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test105"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i22 = testingRandoope0.sum(32, (int)(short)1);
    int i25 = testingRandoope0.sum(340, 99);
    int i28 = testingRandoope0.sum(1599, 3181);
    int i31 = testingRandoope0.sum(4757, 120594);
    int i35 = testingRandoope0.sum(23382, 20791, 63);
    int i38 = testingRandoope0.sum(275513, 16408);
    int i42 = testingRandoope0.sum(1747339, 187373, 216966);
    int i46 = testingRandoope0.sum(399754, 1296751, 490006);
    int i50 = testingRandoope0.sum(5559128, 17815, 312099);
    int i54 = testingRandoope0.sum(3732491, 10243475, 261396);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 439);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 4780);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 125351);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 44236);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 291921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 2151678);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 2186511);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 5889042);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 14237362);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test106"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum(260, 323, (int)(byte)0);
    int i7 = testingRandoope0.sum(0, 161);
    int i11 = testingRandoope0.sum(5156561, 1658350, 55089);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 583);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 6870000);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test107"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum((int)'4', (int)(short)-1, (int)(byte)0);
    int i14 = testingRandoope0.sum(132, 551);
    int i18 = testingRandoope0.sum(1311, (int)(byte)1, 632);
    int i21 = testingRandoope0.sum(182, 5290);
    int i25 = testingRandoope0.sum(5662, 5241, 964);
    int i29 = testingRandoope0.sum(31996, 18863, 4282);
    int i33 = testingRandoope0.sum(5705, 33202, 0);
    int i37 = testingRandoope0.sum(118299, 19011, 128268);
    int i40 = testingRandoope0.sum(769514, 501595);
    int i44 = testingRandoope0.sum(115495, 1140488, 6329607);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 683);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5472);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 11867);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 55141);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 38907);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 265578);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1271109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 7585590);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test108"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum(359, 0, 0);
    int i7 = testingRandoope0.sum(813, 1593);
    int i11 = testingRandoope0.sum(28666, 19044, 59139);
    int i14 = testingRandoope0.sum(564502, 959786);
    int i17 = testingRandoope0.sum(5187320, 747035);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 359);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2406);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 106849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 5934355);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test109"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum(45, 150, 149);
    int i19 = testingRandoope0.sum(484, 1129, (int)'#');
    int i23 = testingRandoope0.sum(17948, 6741, 160);
    int i27 = testingRandoope0.sum(13414, 9, 4589);
    int i30 = testingRandoope0.sum(1831, 0);
    int i33 = testingRandoope0.sum(3069, 13356);
    int i37 = testingRandoope0.sum(5344, 5978, 14601);
    int i41 = testingRandoope0.sum(15605, 260, 118122);
    int i45 = testingRandoope0.sum(111431, 54946, 238010);
    int i48 = testingRandoope0.sum(3944, 309396);
    int i51 = testingRandoope0.sum(5140056, 4963888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 24849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 18012);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 16425);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 25923);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 133987);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 404387);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 313340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 10103944);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test110"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i10 = testingRandoope0.sum((int)(short)1, 0);
    int i13 = testingRandoope0.sum(356, 9);
    int i16 = testingRandoope0.sum(1245445, 82122);
    int i19 = testingRandoope0.sum(841104, 523698);
    int i23 = testingRandoope0.sum(533945, 3898058, 1129170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 365);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1327567);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1364802);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 5561173);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test111"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(576, 247);
    int i28 = testingRandoope0.sum((int)(byte)1, 160);
    int i31 = testingRandoope0.sum(581, 32);
    int i34 = testingRandoope0.sum(2525, (int)(short)10);
    int i38 = testingRandoope0.sum(815, 3328, 1420);
    int i42 = testingRandoope0.sum(8794, 12084, 17780);
    int i45 = testingRandoope0.sum(83603, 8565);
    int i49 = testingRandoope0.sum(545, 150056, 21502);
    int i52 = testingRandoope0.sum(1684799, 335575);
    int i56 = testingRandoope0.sum(100839, 97077, 0);
    int i59 = testingRandoope0.sum(2562929, 3492696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 2535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 5563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 38658);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 92168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 172103);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 2020374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 197916);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 6055625);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test112"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)1, (int)(byte)10);
    int i14 = testingRandoope0.sum(83420, 22623);
    int i17 = testingRandoope0.sum(8109640, 394064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 106043);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 8503704);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test113"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum((int)(short)100, 149, 64);
    int i19 = testingRandoope0.sum(408, 137, 0);
    int i22 = testingRandoope0.sum(645, 8060);
    int i25 = testingRandoope0.sum(150056, 8254);
    int i28 = testingRandoope0.sum(870552, 472493);
    int i32 = testingRandoope0.sum(5502390, 55408, 7958554);
    int i35 = testingRandoope0.sum(1201099, 1996156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 313);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 545);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 8705);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 158310);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1343045);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 13516352);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 3197255);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test114"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum(45, 150, 149);
    int i19 = testingRandoope0.sum(484, 1129, (int)'#');
    int i23 = testingRandoope0.sum(85435, 0, 21270);
    int i26 = testingRandoope0.sum(275050, 91006);
    int i30 = testingRandoope0.sum(331701, 78525, 122044);
    int i33 = testingRandoope0.sum(1845908, 529150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 106705);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 366056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 532270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 2375058);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test115"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i12 = testingRandoope0.sum(150, 10, (int)(byte)0);
    int i16 = testingRandoope0.sum(44, 683, 369);
    int i19 = testingRandoope0.sum(488, 13451);
    int i23 = testingRandoope0.sum(7752, 1353, 1508);
    int i27 = testingRandoope0.sum(297615, 402931, 119561);
    int i31 = testingRandoope0.sum(25580523, 3490931, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 13939);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 10613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 820107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 29071454);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test116"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum((int)(short)0, 10);
    int i9 = testingRandoope0.sum((int)'4', 98);
    int i12 = testingRandoope0.sum(99, 132);
    int i16 = testingRandoope0.sum(132, (int)(short)-1, 83);
    int i20 = testingRandoope0.sum(1461, 683, (int)(byte)0);
    int i24 = testingRandoope0.sum(1461, 1123, 331);
    int i28 = testingRandoope0.sum(3992, 2126, 611);
    int i32 = testingRandoope0.sum(15007, 3816, 6741);
    int i36 = testingRandoope0.sum(4766, 16254, 4475);
    int i40 = testingRandoope0.sum(805, 29295, 4283);
    int i44 = testingRandoope0.sum(178027, 279818, 31030);
    int i47 = testingRandoope0.sum(369144, 2272911);
    int i51 = testingRandoope0.sum(895843, 552858, 949169);
    int i54 = testingRandoope0.sum(46953, 1362452);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 231);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2915);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 6729);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 25564);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 25495);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 34383);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 488875);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 2642055);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 2397870);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1409405);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test117"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i10 = testingRandoope0.sum((int)(short)1, 0);
    int i13 = testingRandoope0.sum(1921, 356);
    int i16 = testingRandoope0.sum(19091, 537976);
    int i19 = testingRandoope0.sum(16033, 39375);
    int i22 = testingRandoope0.sum(457730, 1665566);
    int i26 = testingRandoope0.sum(3970048, 5301036, 2750422);
    int i30 = testingRandoope0.sum(1429092, 26079, 1670608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 557067);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 55408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2123296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 12021506);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3125779);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test118"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum((int)'4', (int)(short)-1, (int)(byte)0);
    int i15 = testingRandoope0.sum(1974, 33, 518);
    int i18 = testingRandoope0.sum(33, 581);
    int i21 = testingRandoope0.sum(137, 5124);
    int i24 = testingRandoope0.sum(315, 44);
    int i27 = testingRandoope0.sum(3619, 1113);
    int i31 = testingRandoope0.sum(205728, 0, 191932);
    int i35 = testingRandoope0.sum(895986, 526470, 457657);
    int i38 = testingRandoope0.sum(106453, 39759);
    int i42 = testingRandoope0.sum(47624, 379140, 121805);
    int i45 = testingRandoope0.sum(147978, 166729);
    int i49 = testingRandoope0.sum(332609, 3129096, 2563);
    int i53 = testingRandoope0.sum(1056272, 1729461, 505502);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2525);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5261);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 359);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4732);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 397660);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1880113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 146212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 548569);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 314707);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 3464268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 3291235);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test119"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)' ', (int)'#', 150);
    int i12 = testingRandoope0.sum(100, 60, 109);
    int i16 = testingRandoope0.sum(101, 33, 430);
    int i19 = testingRandoope0.sum(313, 217);
    int i22 = testingRandoope0.sum(1944, (int)(short)1);
    int i25 = testingRandoope0.sum(347, 5824);
    int i29 = testingRandoope0.sum(9997, 8060, 1423);
    int i32 = testingRandoope0.sum(6914, 9126);
    int i35 = testingRandoope0.sum(0, 2954744);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 564);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 530);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1945);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 6171);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 19480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 16040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 2954744);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test120"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i7 = testingRandoope0.sum((int)(short)1, 99, (int)(short)1);
    int i11 = testingRandoope0.sum(430, 0, 576);
    int i15 = testingRandoope0.sum(576, 2767, 20698);
    int i18 = testingRandoope0.sum(5407, 4375);
    int i21 = testingRandoope0.sum(12011, 7489);
    int i24 = testingRandoope0.sum(3337300, 3138818);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1006);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 24041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 9782);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 19500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 6476118);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test121"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(0, 313);
    int i17 = testingRandoope0.sum(1147, 101);
    int i20 = testingRandoope0.sum(2930, 0);
    int i23 = testingRandoope0.sum(28627, 13415);
    int i27 = testingRandoope0.sum(444946, 127396, 2341417);
    int i31 = testingRandoope0.sum(250683, 1915338, 9796);
    int i34 = testingRandoope0.sum(7426041, 842576);
    int i37 = testingRandoope0.sum(2257969, 1665566);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 313);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2930);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 42042);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2913759);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2175817);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 8268617);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 3923535);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test122"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(2458, 21);
    int i28 = testingRandoope0.sum(2933, 5441);
    int i32 = testingRandoope0.sum(7826, 4836, 12228);
    int i35 = testingRandoope0.sum(22082, 16789);
    int i38 = testingRandoope0.sum(632, 55055);
    int i42 = testingRandoope0.sum(18344, 58551, 11507);
    int i46 = testingRandoope0.sum(2131, 48565, 9896);
    int i49 = testingRandoope0.sum(209845, 158985);
    int i52 = testingRandoope0.sum(908823, 2425692);
    int i56 = testingRandoope0.sum(1281481, 723834, 9007871);
    int i59 = testingRandoope0.sum(6525909, 3797370);
    int i63 = testingRandoope0.sum(308429, 300464, 2021246);
    int i66 = testingRandoope0.sum(358811, 1119513);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 2479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 8374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 24890);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 38871);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 55687);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 88402);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 60592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 368830);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 3334515);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 11013186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 10323279);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 2630139);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1478324);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test123"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(149, 98);
    int i18 = testingRandoope0.sum(407, 1, 407);
    int i22 = testingRandoope0.sum(23385, 59309, 5795);
    int i25 = testingRandoope0.sum(48709, 167585);
    int i28 = testingRandoope0.sum(31445, 178279);
    int i32 = testingRandoope0.sum(394337, 36764, 55415);
    int i35 = testingRandoope0.sum(645338, 1269074);
    int i39 = testingRandoope0.sum(488198, 328637, 225337);
    int i43 = testingRandoope0.sum(1217890, 1669928, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 815);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 88489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 216294);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 209724);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 486516);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1914412);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1042172);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 2887818);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test124"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum(100, 0);
    int i9 = testingRandoope0.sum((-1), (int)(short)100);
    int i12 = testingRandoope0.sum(9, (int)(short)0);
    int i15 = testingRandoope0.sum(10, 217);
    int i18 = testingRandoope0.sum(369, 149);
    int i21 = testingRandoope0.sum(161, 3992);
    int i24 = testingRandoope0.sum(5825, (int)(byte)-1);
    int i27 = testingRandoope0.sum(5290, 5307);
    int i31 = testingRandoope0.sum(29219, 7752, 3944);
    int i34 = testingRandoope0.sum(11419, 7625);
    int i37 = testingRandoope0.sum(5455, 14601);
    int i40 = testingRandoope0.sum(160, 4235);
    int i43 = testingRandoope0.sum(1215829, 2327058);
    int i46 = testingRandoope0.sum(2502786, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 10597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 40915);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 19044);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 20056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 4395);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 3542887);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 2502786);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test125"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i12 = testingRandoope0.sum(299008, 3980, 161078);
    int i16 = testingRandoope0.sum(563219, 429701, 891550);
    int i19 = testingRandoope0.sum(825991, 1239075);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 464066);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1884470);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2065066);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test126"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(0, 313);
    int i17 = testingRandoope0.sum(0, 2016);
    int i20 = testingRandoope0.sum(347, 5662);
    int i24 = testingRandoope0.sum(6188, 5824, 583);
    int i28 = testingRandoope0.sum(33, 18012, 27694);
    int i32 = testingRandoope0.sum(29549, 298, 55366);
    int i35 = testingRandoope0.sum(3605606, 791755);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 313);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2016);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 6009);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 12595);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 45739);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 85213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 4397361);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test127"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum((int)(short)0, 10);
    int i9 = testingRandoope0.sum((int)'4', 98);
    int i12 = testingRandoope0.sum(99, 132);
    int i15 = testingRandoope0.sum(214, 130);
    int i18 = testingRandoope0.sum(4579, 4988);
    int i21 = testingRandoope0.sum(56851, 583240);
    int i25 = testingRandoope0.sum(372913, 308437, 830330);
    int i28 = testingRandoope0.sum(679273, 906508);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 231);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 9567);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 640091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1511680);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1585781);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test128"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum((int)(short)0, 10);
    int i9 = testingRandoope0.sum((int)'4', 98);
    int i12 = testingRandoope0.sum(99, 132);
    int i15 = testingRandoope0.sum(19665, 421);
    int i19 = testingRandoope0.sum(11829, 38956, 1648);
    int i22 = testingRandoope0.sum(638567, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 231);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 20086);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 52433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 638567);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test129"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum(100, 0);
    int i9 = testingRandoope0.sum((-1), (int)(short)100);
    int i12 = testingRandoope0.sum(9, (int)(short)0);
    int i15 = testingRandoope0.sum(10, 217);
    int i18 = testingRandoope0.sum(369, 149);
    int i21 = testingRandoope0.sum(161, 3992);
    int i24 = testingRandoope0.sum(5825, (int)(byte)-1);
    int i27 = testingRandoope0.sum(5290, 5307);
    int i31 = testingRandoope0.sum(29219, 7752, 3944);
    int i34 = testingRandoope0.sum(2451, 57987);
    int i37 = testingRandoope0.sum(177587, 0);
    int i41 = testingRandoope0.sum(368373, 0, 542437);
    int i45 = testingRandoope0.sum(3917375, 13538, 6729);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 10597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 40915);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 60438);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 177587);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 910810);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 3937642);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test130"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum(1, (int)(short)-1);
    int i6 = testingRandoope0.sum(150, 32);
    int i10 = testingRandoope0.sum(21, 5290, 101);
    int i13 = testingRandoope0.sum(6741, 2881);
    int i16 = testingRandoope0.sum(747, 777);
    int i20 = testingRandoope0.sum(243719, 33976, 0);
    int i23 = testingRandoope0.sum(1386460, 152321);
    int i26 = testingRandoope0.sum(146994, 483068);
    int i30 = testingRandoope0.sum(399753, 235279, 111236);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 5412);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 9622);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1524);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 277695);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1538781);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 630062);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 746268);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test131"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum((int)(short)100, 149, 64);
    int i19 = testingRandoope0.sum(340, 11, 298);
    int i23 = testingRandoope0.sum((int)(short)1, 2525, 430);
    int i27 = testingRandoope0.sum(14772, 3965, 658);
    int i30 = testingRandoope0.sum(156248, 244396);
    int i33 = testingRandoope0.sum(764088, 372558);
    int i37 = testingRandoope0.sum(8754928, 3044944, 4415630);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 313);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 649);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2956);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 19395);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 400644);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1136646);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 16215502);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test132"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum((int)(short)100, 149, 64);
    int i19 = testingRandoope0.sum(340, 11, 298);
    int i22 = testingRandoope0.sum(1420, 614);
    int i26 = testingRandoope0.sum(2431, 2507, 4719);
    int i29 = testingRandoope0.sum(27756, 932);
    int i32 = testingRandoope0.sum((int)'a', 38658);
    int i35 = testingRandoope0.sum(1264825, 1098460);
    int i38 = testingRandoope0.sum(3446071, 33013);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 313);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 649);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2034);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 9657);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 28688);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 38755);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 2363285);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 3479084);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test133"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum(1, (int)(short)-1);
    int i6 = testingRandoope0.sum(150, 32);
    int i10 = testingRandoope0.sum(407, 340, (int)(short)0);
    int i13 = testingRandoope0.sum(110, 5131);
    int i17 = testingRandoope0.sum(7625, 5685, 365);
    int i20 = testingRandoope0.sum(49851, 5559);
    int i23 = testingRandoope0.sum(248091, 592769);
    int i27 = testingRandoope0.sum(324164, 900694, 492454);
    int i30 = testingRandoope0.sum(4818776, 1077427);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 747);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 13675);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 55410);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 840860);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1717312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5896203);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test134"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum(45, 150, 149);
    int i19 = testingRandoope0.sum(65015, 5160, 3965);
    int i23 = testingRandoope0.sum(2162568, 558209, 2537466);
    int i26 = testingRandoope0.sum(351347, 153551);
    int i29 = testingRandoope0.sum(1650250, 13819753);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 74140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 5258243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 504898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 15470003);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test135"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)' ', (int)'#', 150);
    int i12 = testingRandoope0.sum(100, 60, 109);
    int i16 = testingRandoope0.sum(109, 101, 130);
    int i19 = testingRandoope0.sum(56150, 633139);
    int i23 = testingRandoope0.sum(103593, 2090549, 221196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 689289);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2415338);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test136"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum((int)'4', (int)(short)-1, (int)(byte)0);
    int i15 = testingRandoope0.sum(1974, 33, 518);
    int i18 = testingRandoope0.sum(33, 581);
    int i22 = testingRandoope0.sum(132, 739, 1492);
    int i25 = testingRandoope0.sum(649, 15773);
    int i28 = testingRandoope0.sum(14021, 7114);
    int i31 = testingRandoope0.sum(9657, 8500);
    int i34 = testingRandoope0.sum(533394, 272091);
    int i37 = testingRandoope0.sum(383771, 168390);
    int i40 = testingRandoope0.sum(0, 23600);
    int i44 = testingRandoope0.sum(427369, 1601160, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2525);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2363);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 16422);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 21135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 18157);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 805485);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 552161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 23600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 2028529);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test137"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i10 = testingRandoope0.sum((int)(short)1, 0);
    int i13 = testingRandoope0.sum(356, 9);
    int i16 = testingRandoope0.sum(1737, 91295);
    int i20 = testingRandoope0.sum(1689904, 254588, 51668);
    int i24 = testingRandoope0.sum(221214, 225373, 322175);
    int i28 = testingRandoope0.sum(1318743, 312085, 30884840);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 365);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 93032);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1996160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 768762);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 32515668);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test138"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum(1, (int)(short)-1);
    int i6 = testingRandoope0.sum(150, 32);
    int i10 = testingRandoope0.sum(1943, 1173, 149);
    int i13 = testingRandoope0.sum(101, 359);
    int i16 = testingRandoope0.sum(484, 0);
    int i20 = testingRandoope0.sum(19381, 460, 35109);
    int i23 = testingRandoope0.sum(2119, 9997);
    int i27 = testingRandoope0.sum(217, 114198, 359);
    int i30 = testingRandoope0.sum(419153, 90996);
    int i33 = testingRandoope0.sum(1317915, 37921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 460);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 484);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 54950);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 12116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 114774);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 510149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1355836);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test139"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(149, 98);
    int i18 = testingRandoope0.sum(407, 1, 407);
    int i21 = testingRandoope0.sum(2645, 161);
    int i25 = testingRandoope0.sum(502, 7308, 4290);
    int i28 = testingRandoope0.sum(474945, 26650);
    int i32 = testingRandoope0.sum(488386, 674477, 1450977);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 815);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2806);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 12100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 501595);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 2613840);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test140"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)' ', (int)'#', 150);
    int i12 = testingRandoope0.sum(100, 60, 109);
    int i16 = testingRandoope0.sum(109, 101, 130);
    int i19 = testingRandoope0.sum(581, 51);
    int i22 = testingRandoope0.sum(2956, 0);
    int i25 = testingRandoope0.sum(49290, 98338);
    int i29 = testingRandoope0.sum(10097, 356664, 126812);
    int i32 = testingRandoope0.sum(1364218, 342864);
    int i36 = testingRandoope0.sum(695422, 8161208, 773429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 632);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2956);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 147628);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 493573);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1707082);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 9630059);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test141"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i7 = testingRandoope0.sum((int)(short)1, 99, (int)(short)1);
    int i11 = testingRandoope0.sum(430, 0, 576);
    int i14 = testingRandoope0.sum(2458, 8623);
    int i18 = testingRandoope0.sum(19356, 23875, 15908);
    int i21 = testingRandoope0.sum(583865, 154436);
    int i24 = testingRandoope0.sum(0, 374394);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1006);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 11081);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 59139);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 738301);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 374394);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test142"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(576, 247);
    int i28 = testingRandoope0.sum((int)(byte)1, 160);
    int i31 = testingRandoope0.sum(581, 32);
    int i35 = testingRandoope0.sum(150, (int)'a', (int)(byte)100);
    int i38 = testingRandoope0.sum(5134, 5492);
    int i42 = testingRandoope0.sum(13671, 25923, 848);
    int i45 = testingRandoope0.sum(19536, 543497);
    int i48 = testingRandoope0.sum(765236, 47916);
    int i51 = testingRandoope0.sum(10465129, 74967);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 10626);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 40442);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 563033);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 813152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 10540096);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test143"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum(100, 0);
    int i10 = testingRandoope0.sum((int)' ', 0, (int)(short)0);
    int i13 = testingRandoope0.sum(98, (int)' ');
    int i17 = testingRandoope0.sum((int)(byte)10, 1, 10);
    int i20 = testingRandoope0.sum(132, 237);
    int i23 = testingRandoope0.sum(160, 99);
    int i26 = testingRandoope0.sum(502, 0);
    int i29 = testingRandoope0.sum(269, 562);
    int i33 = testingRandoope0.sum(8663, 1004, 6587);
    int i37 = testingRandoope0.sum(34075, 23489, 3619);
    int i41 = testingRandoope0.sum(58803, 17997, 76645);
    int i45 = testingRandoope0.sum(21679, 398502, 40054);
    int i49 = testingRandoope0.sum(596134, 657215, 365104);
    int i52 = testingRandoope0.sum(1800776, 3624092);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 259);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 502);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 16254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 61183);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 153445);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 460235);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1618453);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 5424868);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test144"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum(1, (int)(short)-1);
    int i6 = testingRandoope0.sum(150, 32);
    int i9 = testingRandoope0.sum(100, (int)'4');
    int i12 = testingRandoope0.sum(2933, 4375);
    int i15 = testingRandoope0.sum(14021, (int)(byte)-1);
    int i18 = testingRandoope0.sum(10821, 2535);
    int i21 = testingRandoope0.sum(544653, 221138);
    int i25 = testingRandoope0.sum(1465597, 186478, 231236);
    int i28 = testingRandoope0.sum(199313, 247546);
    int i32 = testingRandoope0.sum(8382144, 14528, 1584340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 7308);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 14020);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 13356);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 765791);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1883311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 446859);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 9981012);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test145"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i12 = testingRandoope0.sum(150, 10, (int)(byte)0);
    int i15 = testingRandoope0.sum(407, 150);
    int i19 = testingRandoope0.sum(12748, 3742, 5563);
    int i23 = testingRandoope0.sum(8565, 12606, 146693);
    int i27 = testingRandoope0.sum(3305161, 3628837, 449885);
    int i30 = testingRandoope0.sum(3195212, 821272);
    int i34 = testingRandoope0.sum(1546816, 2246699, 843821);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 557);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 22053);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 167864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 7383883);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4016484);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 4637336);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test146"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)1, (int)(byte)10);
    int i14 = testingRandoope0.sum(1974, 237);
    int i18 = testingRandoope0.sum(3889, 17898, 8320);
    int i21 = testingRandoope0.sum(269, 21058);
    int i24 = testingRandoope0.sum(21782, 7206);
    int i28 = testingRandoope0.sum(9896, 339960, 222652);
    int i32 = testingRandoope0.sum(3651001, 1582832, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 30107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 21327);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 28988);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 572508);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 5233833);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test147"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(747, 359);
    int i22 = testingRandoope0.sum(182, 5705, 4057);
    int i25 = testingRandoope0.sum(28788, 19033);
    int i29 = testingRandoope0.sum(2743, 46076, 0);
    int i33 = testingRandoope0.sum(32926, 293847, 226423);
    int i37 = testingRandoope0.sum(191014, 5716, 505719);
    int i41 = testingRandoope0.sum(3983723, 871500, 440665);
    int i44 = testingRandoope0.sum(3878467, 2567552);
    int i48 = testingRandoope0.sum(3173353, 686456, 716933);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 9944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 47821);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 48819);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 553196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 702449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 5295888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 6446019);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 4576742);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test148"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i7 = testingRandoope0.sum((int)(short)1, 99, (int)(short)1);
    int i11 = testingRandoope0.sum(430, 0, 576);
    int i14 = testingRandoope0.sum(407, 44);
    int i18 = testingRandoope0.sum(554801, 493220, 2031004);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1006);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 451);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3079025);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test149"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(408, (-1), 0);
    int i15 = testingRandoope0.sum(45, 150, 149);
    int i19 = testingRandoope0.sum(484, 1129, (int)'#');
    int i23 = testingRandoope0.sum(17948, 6741, 160);
    int i27 = testingRandoope0.sum(13414, 9, 4589);
    int i30 = testingRandoope0.sum(1831, 0);
    int i34 = testingRandoope0.sum(352348, 139911, 4165);
    int i38 = testingRandoope0.sum(28139, 189898, 524449);
    int i42 = testingRandoope0.sum(7275009, 1395706, 1952599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 24849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 18012);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 496424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 742486);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 10623314);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test150"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i12 = testingRandoope0.sum(150, 10, (int)(byte)0);
    int i15 = testingRandoope0.sum(407, 150);
    int i18 = testingRandoope0.sum(2671, 1898);
    int i22 = testingRandoope0.sum(7625, 5455, 23611);
    int i25 = testingRandoope0.sum(387960, 2930);
    int i28 = testingRandoope0.sum(500920, 1013592);
    int i32 = testingRandoope0.sum(4489065, 8142251, 3635755);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 557);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4569);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 36691);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 390890);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1514512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 16267071);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test151"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)' ', (int)'#', 150);
    int i12 = testingRandoope0.sum(12087, 5146, 21782);
    int i15 = testingRandoope0.sum(14351, 29561);
    int i18 = testingRandoope0.sum(2683, 79971);
    int i21 = testingRandoope0.sum(276884, 250854);
    int i25 = testingRandoope0.sum(336985, 49506, 985);
    int i28 = testingRandoope0.sum(111877, 779093);
    int i31 = testingRandoope0.sum(4259602, 1517225);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 39015);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 43912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 82654);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 527738);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 387476);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 890970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 5776827);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test152"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(2458, 21);
    int i28 = testingRandoope0.sum(2933, 5441);
    int i31 = testingRandoope0.sum(110, (int)'4');
    int i35 = testingRandoope0.sum(13356, 831, 26366);
    int i39 = testingRandoope0.sum(777, 17754, 5864);
    int i43 = testingRandoope0.sum(278876, 242883, 51583);
    int i46 = testingRandoope0.sum(172240, 290211);
    int i49 = testingRandoope0.sum(0, 8663);
    int i53 = testingRandoope0.sum(0, 777, 606198);
    int i57 = testingRandoope0.sum(517543, 689229, 376110);
    int i60 = testingRandoope0.sum(1779661, 419295);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 2479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 8374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 40553);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 24395);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 573342);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 462451);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 8663);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 606975);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1582882);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 2198956);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test153"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum(1, (int)(short)-1);
    int i6 = testingRandoope0.sum(150, 32);
    int i10 = testingRandoope0.sum(486, 5795, 0);
    int i13 = testingRandoope0.sum(421, 13628);
    int i17 = testingRandoope0.sum(654, 4283, 8708);
    int i21 = testingRandoope0.sum(45939, 1830679, 248873);
    int i24 = testingRandoope0.sum(580848, 3279311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 6281);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 14049);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 13645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2125491);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3860159);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test154"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(340, 108, 1944);
    int i14 = testingRandoope0.sum(57424, 0);
    int i17 = testingRandoope0.sum(118874, 1835);
    int i21 = testingRandoope0.sum(442110, 282109, 31122);
    int i24 = testingRandoope0.sum(10687666, 3445496);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2392);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 57424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 120709);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 755341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 14133162);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test155"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i10 = testingRandoope0.sum((int)(short)1, 0);
    int i13 = testingRandoope0.sum(356, 9);
    int i17 = testingRandoope0.sum(5492, 1423, 6730);
    int i20 = testingRandoope0.sum(23611, 0);
    int i23 = testingRandoope0.sum(5864, 94071);
    int i27 = testingRandoope0.sum(42384, 1356817, 2078727);
    int i30 = testingRandoope0.sum(6506171, 878592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 365);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 13645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 23611);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 99935);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 3477928);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7384763);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test156"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum((int)(short)0, 10);
    int i9 = testingRandoope0.sum((int)'4', 98);
    int i12 = testingRandoope0.sum(99, 132);
    int i15 = testingRandoope0.sum(19665, 421);
    int i19 = testingRandoope0.sum(11829, 38956, 1648);
    int i22 = testingRandoope0.sum(6133, 166293);
    int i26 = testingRandoope0.sum(1487, 27516, 39905);
    int i30 = testingRandoope0.sum(36764, 71733, 23720);
    int i34 = testingRandoope0.sum(42796, 154856, 23863);
    int i38 = testingRandoope0.sum(1267105, 210786, 764063);
    int i41 = testingRandoope0.sum(356380, 46076);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 231);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 20086);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 52433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 172426);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 68908);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 132217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 221515);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 2241954);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 402456);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test157"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)' ', (int)'#', 150);
    int i12 = testingRandoope0.sum(100, 60, 109);
    int i16 = testingRandoope0.sum(109, 101, 130);
    int i19 = testingRandoope0.sum(132, 430);
    int i22 = testingRandoope0.sum(654, (int)(short)1);
    int i25 = testingRandoope0.sum(340, 789);
    int i28 = testingRandoope0.sum(110, 2016);
    int i31 = testingRandoope0.sum(12912, 6587);
    int i34 = testingRandoope0.sum(11124, 3685);
    int i37 = testingRandoope0.sum(65716, 2507);
    int i41 = testingRandoope0.sum(94196, 5807, 62194);
    int i45 = testingRandoope0.sum(33005, 22055, 291034);
    int i48 = testingRandoope0.sum(535867, 589699);
    int i51 = testingRandoope0.sum(1518895, 756478);
    int i55 = testingRandoope0.sum(6206632, 5913146, 569163);
    int i59 = testingRandoope0.sum(580554, 1104212, 20749);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 562);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 655);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1129);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 2126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 19499);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 14809);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 68223);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 162197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 346094);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1125566);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 2275373);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 12688941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1705515);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test158"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i22 = testingRandoope0.sum(32, (int)(short)1);
    int i26 = testingRandoope0.sum(13155, 44, 996);
    int i29 = testingRandoope0.sum(408, 616);
    int i32 = testingRandoope0.sum(15806, 53651);
    int i35 = testingRandoope0.sum(13923, 82122);
    int i38 = testingRandoope0.sum(176044, 186609);
    int i42 = testingRandoope0.sum(32599, 1217247, 424368);
    int i46 = testingRandoope0.sum(8644, 285335, 10695796);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 14195);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 69457);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 96045);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 362653);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1674214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 10989775);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test159"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum(1, (int)(short)-1);
    int i6 = testingRandoope0.sum(150, 32);
    int i9 = testingRandoope0.sum(161, 407);
    int i13 = testingRandoope0.sum(12826, 1059, 2535);
    int i17 = testingRandoope0.sum(1106, 1999, 3448);
    int i20 = testingRandoope0.sum(502980, 657215);
    int i23 = testingRandoope0.sum(519911, 887150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 16420);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 6553);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1160195);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1407061);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test160"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i7 = testingRandoope0.sum((int)(short)1, 99, (int)(short)1);
    int i10 = testingRandoope0.sum(2358, 4057);
    int i14 = testingRandoope0.sum(3207, 13675, 26366);
    int i18 = testingRandoope0.sum(79134, 355742, 5662);
    int i21 = testingRandoope0.sum(0, 73406);
    int i25 = testingRandoope0.sum(155130, 30843, 1109886);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 6415);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 43248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 440538);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 73406);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1295859);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test161"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum((int)'4', (int)(short)-1, (int)(byte)0);
    int i14 = testingRandoope0.sum(100, (int)(byte)-1);
    int i17 = testingRandoope0.sum(193572, 45739);
    int i20 = testingRandoope0.sum(23546, 99652);
    int i24 = testingRandoope0.sum(111993, 332, 122044);
    int i28 = testingRandoope0.sum(1081508, 1085555, 819118);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 239311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 123198);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 234369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 2986181);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test162"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum(1, (int)(short)-1);
    int i6 = testingRandoope0.sum(150, 32);
    int i10 = testingRandoope0.sum(407, 340, (int)(short)0);
    int i13 = testingRandoope0.sum(530, 259);
    int i16 = testingRandoope0.sum(893, 0);
    int i19 = testingRandoope0.sum(9796, (int)(short)100);
    int i22 = testingRandoope0.sum(9541, 2560);
    int i26 = testingRandoope0.sum(27676, 55366, 64805);
    int i30 = testingRandoope0.sum(3754459, 276175, 3088235);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 747);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 789);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 893);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 9896);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 12101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 147847);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 7118869);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test163"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)' ', (int)'#', 150);
    int i12 = testingRandoope0.sum(100, 60, 109);
    int i16 = testingRandoope0.sum(101, 33, 430);
    int i20 = testingRandoope0.sum(152, 331, 3992);
    int i23 = testingRandoope0.sum(4153, 4768);
    int i27 = testingRandoope0.sum(12606, 2451, 14021);
    int i31 = testingRandoope0.sum(305548, 1217890, 493573);
    int i34 = testingRandoope0.sum(1152489, 758579);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 269);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 564);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 4475);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 8921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 29078);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2017011);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1911068);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test164"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i22 = testingRandoope0.sum(32, (int)(short)1);
    int i25 = testingRandoope0.sum((int)(byte)0, 85);
    int i28 = testingRandoope0.sum(21424, 1405);
    int i31 = testingRandoope0.sum(21495, 2211);
    int i34 = testingRandoope0.sum(11516, 32682);
    int i38 = testingRandoope0.sum(8991, 12689, 96265);
    int i42 = testingRandoope0.sum(341103, 1876216, 53249);
    int i45 = testingRandoope0.sum(38850, 1540521);
    int i49 = testingRandoope0.sum(1884013, 3072503, 2659629);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 22829);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 23706);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 44198);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 117945);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 2270568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1579371);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 7616145);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test165"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum(227, 10);
    int i10 = testingRandoope0.sum(1405, 545, 408);
    int i14 = testingRandoope0.sum(9997, 9888, 0);
    int i17 = testingRandoope0.sum(67417, 33322);
    int i21 = testingRandoope0.sum(233458, 140727, 169699);
    int i24 = testingRandoope0.sum(9622, 19044);
    int i28 = testingRandoope0.sum(0, 94164, 45939);
    int i32 = testingRandoope0.sum(893, 15908, 112257);
    int i35 = testingRandoope0.sum(430213, 378878);
    int i39 = testingRandoope0.sum(288461, 225546, 550186);
    int i42 = testingRandoope0.sum(0, 12511807);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 237);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2358);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 19885);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100739);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 543884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 28666);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 140103);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 129058);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 809091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1064193);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 12511807);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test166"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum(1, (int)(short)-1);
    int i6 = testingRandoope0.sum(150, 32);
    int i10 = testingRandoope0.sum(407, 340, (int)(short)0);
    int i13 = testingRandoope0.sum(530, 259);
    int i16 = testingRandoope0.sum(893, 0);
    int i20 = testingRandoope0.sum(2525, 86108, 130);
    int i23 = testingRandoope0.sum(15055, 845385);
    int i27 = testingRandoope0.sum(216602, 8318430, 752569);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 747);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 789);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 893);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 88763);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 860440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9287601);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test167"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i26 = testingRandoope0.sum(407, 839, 5124);
    int i29 = testingRandoope0.sum(55687, 20873);
    int i32 = testingRandoope0.sum(5752719, 468719);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 6370);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 76560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 6221438);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test168"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum(109, 298, 1);
    int i14 = testingRandoope0.sum(149, 98);
    int i18 = testingRandoope0.sum(152, 137, 99);
    int i22 = testingRandoope0.sum(1246, 5858, 1311);
    int i25 = testingRandoope0.sum(1461, 2806);
    int i28 = testingRandoope0.sum(0, 789);
    int i32 = testingRandoope0.sum(99, 5339, 60);
    int i35 = testingRandoope0.sum(0, 12256);
    int i39 = testingRandoope0.sum(0, (int)'a', 71886);
    int i43 = testingRandoope0.sum(414144, 755699, 16420);
    int i46 = testingRandoope0.sum(1427960, 3300475);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 388);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 8415);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 4267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 789);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 5498);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 12256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 71983);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1186263);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 4728435);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test169"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i19 = testingRandoope0.sum(51, (int)(short)10, (int)(byte)-1);
    int i22 = testingRandoope0.sum(32, (int)(short)1);
    int i26 = testingRandoope0.sum(13155, 44, 996);
    int i30 = testingRandoope0.sum(562, 1633, 1310);
    int i34 = testingRandoope0.sum(12677, 40374, 49286);
    int i37 = testingRandoope0.sum(50422, 1898);
    int i41 = testingRandoope0.sum(23316, 595510, 2228608);
    int i45 = testingRandoope0.sum(422320, 56803, 183707);
    int i48 = testingRandoope0.sum(1707492, 136608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 14195);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3505);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 102337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 52320);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 2847434);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 662830);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1844100);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test170"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(10673, 934);
    int i21 = testingRandoope0.sum(7625, 0);
    int i25 = testingRandoope0.sum(1859, 9151, 12710);
    int i28 = testingRandoope0.sum(22653, 12660);
    int i31 = testingRandoope0.sum(25073, 0);
    int i35 = testingRandoope0.sum(69710, 592769, 77032);
    int i39 = testingRandoope0.sum(3071918, 442466, 39154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11607);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 7625);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 23720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 35313);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 25073);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 739511);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 3553538);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test171"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(130, 451);
    int i28 = testingRandoope0.sum(152, 1116);
    int i31 = testingRandoope0.sum(2560, 1405);
    int i34 = testingRandoope0.sum(117, 0);
    int i37 = testingRandoope0.sum((int)(short)100, (int)(short)10);
    int i40 = testingRandoope0.sum(581, 214);
    int i44 = testingRandoope0.sum(1123, 1617, 632);
    int i48 = testingRandoope0.sum(990, 32, 977);
    int i51 = testingRandoope0.sum(93371, 197339);
    int i54 = testingRandoope0.sum(20893, 653448);
    int i58 = testingRandoope0.sum(60573, 82936, 92518);
    int i61 = testingRandoope0.sum(14823557, 1096384);
    int i64 = testingRandoope0.sum(2700857, 3073230);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 3965);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 795);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 3372);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 290710);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 674341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 236027);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 15919941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 5774087);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test172"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i15 = testingRandoope0.sum(100, 98, (int)(short)100);
    int i18 = testingRandoope0.sum(85, 32);
    int i22 = testingRandoope0.sum((int)(short)100, 564, 33);
    int i25 = testingRandoope0.sum(576, 247);
    int i28 = testingRandoope0.sum((int)(byte)1, 160);
    int i31 = testingRandoope0.sum(581, 32);
    int i34 = testingRandoope0.sum(2525, (int)(short)10);
    int i38 = testingRandoope0.sum(815, 3328, 1420);
    int i42 = testingRandoope0.sum(45900, 19480, 8693);
    int i46 = testingRandoope0.sum(4579, 0, 6891);
    int i50 = testingRandoope0.sum(786780, 160042, 64139);
    int i54 = testingRandoope0.sum(117133, 126657, 853233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 697);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 823);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 613);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 2535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 5563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 74073);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 11470);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1010961);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1097023);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test173"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum(227, 10);
    int i9 = testingRandoope0.sum(590, 564);
    int i13 = testingRandoope0.sum(847, 14868, 4574);
    int i17 = testingRandoope0.sum(81465, 123300, 8773);
    int i20 = testingRandoope0.sum(375505, 211795);
    int i23 = testingRandoope0.sum(1266087, 30705);
    int i26 = testingRandoope0.sum(365759, 1252494);
    int i29 = testingRandoope0.sum(389354, 2230249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 237);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 20289);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 213538);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 587300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1296792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1618253);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2619603);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test174"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i10 = testingRandoope0.sum((int)(short)1, 0);
    int i13 = testingRandoope0.sum(424, 389);
    int i17 = testingRandoope0.sum(9, 2915, 7304);
    int i21 = testingRandoope0.sum(14772, 315, 16338);
    int i24 = testingRandoope0.sum(44383, 40670);
    int i28 = testingRandoope0.sum(276399, 72921, 996);
    int i32 = testingRandoope0.sum(323, 35792, 84023);
    int i35 = testingRandoope0.sum(113121, 56363);
    int i38 = testingRandoope0.sum(71733, 37827);
    int i42 = testingRandoope0.sum(1240532, 1095527, 5788696);
    int i45 = testingRandoope0.sum(801482, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 813);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10228);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 31425);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 85053);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 350316);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 120138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 169484);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 109560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 8124755);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 801482);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test175"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i8 = testingRandoope0.sum((int)'4', (int)(short)1, (int)' ');
    int i11 = testingRandoope0.sum((int)(byte)1, (int)(byte)10);
    int i14 = testingRandoope0.sum(1974, 237);
    int i18 = testingRandoope0.sum(1944, 18363, 8320);
    int i21 = testingRandoope0.sum(332, 13352);
    int i25 = testingRandoope0.sum(17990, 232223, 61707);
    int i28 = testingRandoope0.sum(27101, 114043);
    int i32 = testingRandoope0.sum(1211218, 184618, 2771924);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 28627);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 13684);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 311920);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 141144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 4167760);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test176"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum((int)'4', (int)(short)-1, (int)(byte)0);
    int i15 = testingRandoope0.sum(1974, 33, 518);
    int i18 = testingRandoope0.sum(33, 581);
    int i22 = testingRandoope0.sum(132, 739, 1492);
    int i25 = testingRandoope0.sum(649, 15773);
    int i28 = testingRandoope0.sum(14021, 7114);
    int i31 = testingRandoope0.sum(9657, 8500);
    int i35 = testingRandoope0.sum(57327, 414016, 57930);
    int i38 = testingRandoope0.sum(2587355, 1603631);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2525);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2363);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 16422);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 21135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 18157);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 529273);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 4190986);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test177"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i4 = testingRandoope0.sum((int)(short)1, 0, (int)'a');
    int i7 = testingRandoope0.sum(0, 85);
    int i11 = testingRandoope0.sum((int)'4', (int)(short)-1, (int)(byte)0);
    int i14 = testingRandoope0.sum(100, (int)(byte)-1);
    int i18 = testingRandoope0.sum(407, 182, 1);
    int i22 = testingRandoope0.sum(15459, 39012, 29542);
    int i26 = testingRandoope0.sum(34580, 1830013, 2043441);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 590);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 84013);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 3908034);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test178"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum(1, (int)(short)-1);
    int i6 = testingRandoope0.sum(150, 32);
    int i10 = testingRandoope0.sum(747, 657, 19);
    int i13 = testingRandoope0.sum(30211, 8745);
    int i16 = testingRandoope0.sum(112688, 36795);
    int i20 = testingRandoope0.sum(64875, 62194, 80797);
    int i23 = testingRandoope0.sum(0, 170591);
    int i27 = testingRandoope0.sum(10800, 8745, 1042612);
    int i30 = testingRandoope0.sum(1911458, 111431);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1423);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 38956);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 149483);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 207866);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 170591);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1062157);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2022889);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest34.test179"); }

    TestingRandoope testingRandoope0 = new TestingRandoope();
    int i3 = testingRandoope0.sum((int)(byte)10, (int)(short)-1);
    int i6 = testingRandoope0.sum((int)(short)0, 10);
    int i9 = testingRandoope0.sum((int)'4', 98);
    int i12 = testingRandoope0.sum(99, 132);
    int i15 = testingRandoope0.sum(214, 130);
    int i18 = testingRandoope0.sum(4579, 4988);
    int i22 = testingRandoope0.sum(590, 138858, 28969);
    int i25 = testingRandoope0.sum(36260, 498451);
    int i29 = testingRandoope0.sum(1208159, 19921, 1831);
    int i33 = testingRandoope0.sum(43757, 267934, 0);
    int i37 = testingRandoope0.sum(1475469, 669488, 1601849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 150);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 231);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 9567);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 168417);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 534711);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1229911);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 311691);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 3746806);

  }

}
