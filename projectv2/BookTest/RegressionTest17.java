
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test001"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getAuthor();
    java.lang.String str18 = book3.getTitle();
    java.lang.String str19 = book3.getISBN();
    java.lang.String str20 = book3.getTitle();
    java.lang.String str21 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test002"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getTitle();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test003"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getTitle();
    book3.setAvailable(true);
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test004"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str15 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test005"); }

    Book book0 = new Book();
    book0.setAvailable(true);
    boolean b3 = book0.isAvailable();
    book0.setAvailable(true);
    boolean b6 = book0.isAvailable();
    java.lang.String str7 = book0.getISBN();
    java.lang.String str8 = book0.getAuthor();
    boolean b9 = book0.isAvailable();
    java.lang.String str10 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test006"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test007"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str15 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test008"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    boolean b14 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(false);
    book3.setAvailable(true);
    boolean b21 = book3.isAvailable();
    java.lang.String str22 = book3.getISBN();
    boolean b23 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test009"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getAuthor();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test010"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    book3.setAvailable(false);
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getTitle();
    boolean b11 = book3.isAvailable();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test011"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test012"); }

    Book book3 = new Book("hi!", "hi!", "");
    java.lang.String str4 = book3.getAuthor();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test013"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str17 = book3.getTitle();
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getAuthor();
    boolean b20 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test014"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str22 = book3.getAuthor();
    java.lang.String str23 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test015"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(true);
    boolean b14 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getISBN();
    java.lang.String str20 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test016"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getAuthor();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getAuthor();
    java.lang.String str20 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test017"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getISBN();
    boolean b14 = book3.isAvailable();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getTitle();
    java.lang.String str18 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test018"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(false);
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getAuthor();
    boolean b17 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test019"); }

    Book book3 = new Book("hi!", "hi!", "");
    book3.setAvailable(false);
    boolean b6 = book3.isAvailable();
    boolean b7 = book3.isAvailable();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test020"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getISBN();
    boolean b17 = book3.isAvailable();
    java.lang.String str18 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test021"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getISBN();
    boolean b8 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getTitle();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test022"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str13 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str18 = book3.getTitle();
    java.lang.String str19 = book3.getTitle();
    java.lang.String str20 = book3.getTitle();
    java.lang.String str21 = book3.getTitle();
    java.lang.String str22 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str25 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test023"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    boolean b14 = book3.isAvailable();
    boolean b15 = book3.isAvailable();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test024"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    book0.setAvailable(false);
    java.lang.String str6 = book0.getTitle();
    boolean b7 = book0.isAvailable();
    java.lang.String str8 = book0.getISBN();
    boolean b9 = book0.isAvailable();
    book0.setAvailable(false);
    book0.setAvailable(true);
    java.lang.String str14 = book0.getISBN();
    java.lang.String str15 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test025"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str17 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test026"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    boolean b12 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str15 = book3.getAuthor();
    book3.setAvailable(true);
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test027"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getISBN();
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getTitle();
    boolean b11 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test028"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test029"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test030"); }

    Book book0 = new Book();
    book0.setAvailable(true);
    book0.setAvailable(false);
    java.lang.String str5 = book0.getAuthor();
    book0.setAvailable(true);
    book0.setAvailable(false);
    java.lang.String str10 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test031"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(false);
    boolean b15 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getAuthor();
    boolean b20 = book3.isAvailable();
    java.lang.String str21 = book3.getTitle();
    java.lang.String str22 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test032"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    java.lang.String str5 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str14 = book3.getISBN();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test033"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getTitle();
    java.lang.String str5 = book3.getTitle();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getAuthor();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test034"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getISBN();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test035"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test036"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test037"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    book0.setAvailable(true);
    java.lang.String str7 = book0.getAuthor();
    book0.setAvailable(true);
    boolean b10 = book0.isAvailable();
    book0.setAvailable(true);
    boolean b13 = book0.isAvailable();
    java.lang.String str14 = book0.getTitle();
    book0.setAvailable(true);
    book0.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test038"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test039"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str16 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str19 = book3.getISBN();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test040"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getAuthor();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str16 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str19 = book3.getAuthor();
    java.lang.String str20 = book3.getTitle();
    java.lang.String str21 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str24 = book3.getTitle();
    java.lang.String str25 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test041"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str13 = book3.getISBN();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getISBN();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test042"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getISBN();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getTitle();
    java.lang.String str19 = book3.getTitle();
    java.lang.String str20 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test043"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    book3.setAvailable(true);
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test044"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getISBN();
    book0.setAvailable(true);
    boolean b6 = book0.isAvailable();
    boolean b7 = book0.isAvailable();
    boolean b8 = book0.isAvailable();
    java.lang.String str9 = book0.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test045"); }

    Book book3 = new Book("hi!", "", "hi!");
    java.lang.String str4 = book3.getAuthor();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test046"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    book3.setAvailable(false);
    boolean b14 = book3.isAvailable();
    book3.setAvailable(false);
    boolean b17 = book3.isAvailable();
    java.lang.String str18 = book3.getAuthor();
    boolean b19 = book3.isAvailable();
    java.lang.String str20 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test047"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getTitle();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test048"); }

    Book book3 = new Book("", "", "hi!");
    boolean b4 = book3.isAvailable();
    java.lang.String str5 = book3.getTitle();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test049"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getAuthor();
    boolean b15 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test050"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str6 = book0.getTitle();
    java.lang.String str7 = book0.getAuthor();
    boolean b8 = book0.isAvailable();
    java.lang.String str9 = book0.getISBN();
    java.lang.String str10 = book0.getTitle();
    boolean b11 = book0.isAvailable();
    java.lang.String str12 = book0.getTitle();
    java.lang.String str13 = book0.getTitle();
    java.lang.String str14 = book0.getTitle();
    boolean b15 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test051"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(true);
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getISBN();
    boolean b16 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str19 = book3.getISBN();
    java.lang.String str20 = book3.getTitle();
    java.lang.String str21 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test052"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    book3.setAvailable(false);
    boolean b12 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test053"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    boolean b4 = book3.isAvailable();
    boolean b5 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test054"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getISBN();
    book3.setAvailable(true);
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getTitle();
    boolean b18 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test055"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getTitle();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getAuthor();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getAuthor();
    java.lang.String str18 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test056"); }

    Book book0 = new Book();
    book0.setAvailable(true);
    boolean b3 = book0.isAvailable();
    java.lang.String str4 = book0.getTitle();
    book0.setAvailable(false);
    book0.setAvailable(true);
    book0.setAvailable(false);
    book0.setAvailable(false);
    boolean b13 = book0.isAvailable();
    java.lang.String str14 = book0.getTitle();
    boolean b15 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test057"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getAuthor();
    java.lang.String str20 = book3.getAuthor();
    java.lang.String str21 = book3.getAuthor();
    java.lang.String str22 = book3.getTitle();
    java.lang.String str23 = book3.getISBN();
    java.lang.String str24 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test058"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    boolean b2 = book0.isAvailable();
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getTitle();
    boolean b5 = book0.isAvailable();
    boolean b6 = book0.isAvailable();
    book0.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test059"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(false);
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str17 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test060"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str20 = book3.getISBN();
    java.lang.String str21 = book3.getTitle();
    java.lang.String str22 = book3.getAuthor();
    java.lang.String str23 = book3.getAuthor();
    boolean b24 = book3.isAvailable();
    java.lang.String str25 = book3.getTitle();
    java.lang.String str26 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test061"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getAuthor();
    java.lang.String str20 = book3.getAuthor();
    java.lang.String str21 = book3.getTitle();
    java.lang.String str22 = book3.getAuthor();
    java.lang.String str23 = book3.getAuthor();
    java.lang.String str24 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test062"); }

    Book book3 = new Book("", "", "hi!");
    boolean b4 = book3.isAvailable();
    java.lang.String str5 = book3.getTitle();
    boolean b6 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str11 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test063"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test064"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test065"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(false);
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test066"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test067"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getTitle();
    boolean b17 = book3.isAvailable();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test068"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(false);
    boolean b14 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test069"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str16 = book3.getTitle();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test070"); }

    Book book3 = new Book("hi!", "hi!", "");
    boolean b4 = book3.isAvailable();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test071"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getTitle();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test072"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str7 = book0.getISBN();
    java.lang.String str8 = book0.getAuthor();
    java.lang.String str9 = book0.getTitle();
    boolean b10 = book0.isAvailable();
    java.lang.String str11 = book0.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test073"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getISBN();
    boolean b16 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str21 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str24 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test074"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str6 = book0.getTitle();
    java.lang.String str7 = book0.getAuthor();
    boolean b8 = book0.isAvailable();
    java.lang.String str9 = book0.getAuthor();
    boolean b10 = book0.isAvailable();
    java.lang.String str11 = book0.getTitle();
    boolean b12 = book0.isAvailable();
    java.lang.String str13 = book0.getISBN();
    boolean b14 = book0.isAvailable();
    boolean b15 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test075"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getISBN();
    book3.setAvailable(false);
    boolean b18 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str21 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test076"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str15 = book3.getTitle();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getTitle();
    book3.setAvailable(true);
    boolean b20 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str23 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test077"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    boolean b15 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str18 = book3.getTitle();
    java.lang.String str19 = book3.getISBN();
    java.lang.String str20 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test078"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test079"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str9 = book3.getTitle();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getISBN();
    boolean b14 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test080"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str17 = book3.getTitle();
    java.lang.String str18 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str21 = book3.getISBN();
    java.lang.String str22 = book3.getTitle();
    java.lang.String str23 = book3.getAuthor();
    boolean b24 = book3.isAvailable();
    java.lang.String str25 = book3.getAuthor();
    boolean b26 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test081"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test082"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getTitle();
    java.lang.String str5 = book3.getTitle();
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getISBN();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test083"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    boolean b7 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test084"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getAuthor();
    boolean b5 = book0.isAvailable();
    book0.setAvailable(true);
    java.lang.String str8 = book0.getAuthor();
    java.lang.String str9 = book0.getISBN();
    java.lang.String str10 = book0.getISBN();
    boolean b11 = book0.isAvailable();
    java.lang.String str12 = book0.getISBN();
    java.lang.String str13 = book0.getTitle();
    boolean b14 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test085"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getISBN();
    book3.setAvailable(false);
    boolean b16 = book3.isAvailable();
    boolean b17 = book3.isAvailable();
    book3.setAvailable(false);
    boolean b20 = book3.isAvailable();
    java.lang.String str21 = book3.getISBN();
    java.lang.String str22 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test086"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(false);
    boolean b15 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str22 = book3.getAuthor();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test087"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getAuthor();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test088"); }

    Book book0 = new Book();
    book0.setAvailable(true);
    boolean b3 = book0.isAvailable();
    book0.setAvailable(true);
    book0.setAvailable(false);
    java.lang.String str8 = book0.getAuthor();
    java.lang.String str9 = book0.getAuthor();
    java.lang.String str10 = book0.getISBN();
    java.lang.String str11 = book0.getTitle();
    boolean b12 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test089"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str19 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test090"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    java.lang.String str5 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test091"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test092"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(true);
    boolean b15 = book3.isAvailable();
    book3.setAvailable(true);
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test093"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str13 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str16 = book3.getTitle();
    boolean b17 = book3.isAvailable();
    java.lang.String str18 = book3.getTitle();
    java.lang.String str19 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test094"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test095"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str18 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test096"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str17 = book3.getTitle();
    book3.setAvailable(false);
    boolean b20 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test097"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    java.lang.String str5 = book0.getAuthor();
    book0.setAvailable(true);
    boolean b8 = book0.isAvailable();
    java.lang.String str9 = book0.getTitle();
    boolean b10 = book0.isAvailable();
    java.lang.String str11 = book0.getISBN();
    java.lang.String str12 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str15 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test098"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(true);
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getAuthor();
    boolean b15 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test099"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getAuthor();
    boolean b16 = book3.isAvailable();
    boolean b17 = book3.isAvailable();
    java.lang.String str18 = book3.getAuthor();
    boolean b19 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test100"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    book0.setAvailable(true);
    java.lang.String str7 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str10 = book0.getAuthor();
    java.lang.String str11 = book0.getTitle();
    java.lang.String str12 = book0.getAuthor();
    book0.setAvailable(false);
    java.lang.String str15 = book0.getAuthor();
    boolean b16 = book0.isAvailable();
    book0.setAvailable(true);
    book0.setAvailable(false);
    java.lang.String str21 = book0.getAuthor();
    java.lang.String str22 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test101"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(true);
    boolean b10 = book3.isAvailable();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test102"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    boolean b7 = book3.isAvailable();
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(false);
    boolean b11 = book3.isAvailable();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test103"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getAuthor();
    boolean b12 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test104"); }

    Book book0 = new Book();
    book0.setAvailable(true);
    boolean b3 = book0.isAvailable();
    book0.setAvailable(true);
    boolean b6 = book0.isAvailable();
    java.lang.String str7 = book0.getISBN();
    boolean b8 = book0.isAvailable();
    book0.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test105"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    book0.setAvailable(true);
    java.lang.String str7 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str10 = book0.getAuthor();
    java.lang.String str11 = book0.getTitle();
    java.lang.String str12 = book0.getISBN();
    java.lang.String str13 = book0.getISBN();
    java.lang.String str14 = book0.getTitle();
    java.lang.String str15 = book0.getISBN();
    boolean b16 = book0.isAvailable();
    book0.setAvailable(false);
    java.lang.String str19 = book0.getAuthor();
    book0.setAvailable(false);
    java.lang.String str22 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test106"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str14 = book3.getTitle();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test107"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getISBN();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getAuthor();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    boolean b11 = book3.isAvailable();
    boolean b12 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test108"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getAuthor();
    java.lang.String str18 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str21 = book3.getTitle();
    java.lang.String str22 = book3.getTitle();
    java.lang.String str23 = book3.getISBN();
    java.lang.String str24 = book3.getISBN();
    java.lang.String str25 = book3.getISBN();
    java.lang.String str26 = book3.getTitle();
    boolean b27 = book3.isAvailable();
    java.lang.String str28 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test109"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getAuthor();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getISBN();
    book3.setAvailable(true);
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test110"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    boolean b13 = book3.isAvailable();
    boolean b14 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str17 = book3.getAuthor();
    boolean b18 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str21 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test111"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str15 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test112"); }

    Book book0 = new Book();
    book0.setAvailable(true);
    boolean b3 = book0.isAvailable();
    book0.setAvailable(true);
    book0.setAvailable(false);
    boolean b8 = book0.isAvailable();
    java.lang.String str9 = book0.getISBN();
    java.lang.String str10 = book0.getISBN();
    java.lang.String str11 = book0.getISBN();
    java.lang.String str12 = book0.getTitle();
    boolean b13 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test113"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getAuthor();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test114"); }

    Book book3 = new Book("hi!", "", "hi!");
    java.lang.String str4 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    boolean b12 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test115"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test116"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    boolean b4 = book3.isAvailable();
    java.lang.String str5 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test117"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str15 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(true);
    book3.setAvailable(true);
    boolean b22 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test118"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(false);
    boolean b15 = book3.isAvailable();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test119"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getTitle();
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str21 = book3.getAuthor();
    boolean b22 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str25 = book3.getAuthor();
    java.lang.String str26 = book3.getTitle();
    boolean b27 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test120"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getISBN();
    java.lang.String str5 = book3.getISBN();
    java.lang.String str6 = book3.getISBN();
    boolean b7 = book3.isAvailable();
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test121"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getISBN();
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str17 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str20 = book3.getISBN();
    java.lang.String str21 = book3.getTitle();
    boolean b22 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test122"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str13 = book3.getISBN();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test123"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getTitle();
    boolean b15 = book3.isAvailable();
    book3.setAvailable(false);
    boolean b18 = book3.isAvailable();
    boolean b19 = book3.isAvailable();
    java.lang.String str20 = book3.getISBN();
    java.lang.String str21 = book3.getAuthor();
    java.lang.String str22 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test124"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test125"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getTitle();
    book3.setAvailable(true);
    boolean b19 = book3.isAvailable();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test126"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test127"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(true);
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test128"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getISBN();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test129"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getTitle();
    book3.setAvailable(false);
    boolean b19 = book3.isAvailable();
    java.lang.String str20 = book3.getAuthor();
    boolean b21 = book3.isAvailable();
    java.lang.String str22 = book3.getISBN();
    java.lang.String str23 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test130"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str6 = book0.getISBN();
    java.lang.String str7 = book0.getTitle();
    book0.setAvailable(true);
    java.lang.String str10 = book0.getAuthor();
    boolean b11 = book0.isAvailable();
    java.lang.String str12 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str15 = book0.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test131"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str16 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test132"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getTitle();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test133"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getISBN();
    boolean b17 = book3.isAvailable();
    java.lang.String str18 = book3.getTitle();
    java.lang.String str19 = book3.getAuthor();
    java.lang.String str20 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test134"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    book0.setAvailable(true);
    java.lang.String str7 = book0.getAuthor();
    book0.setAvailable(true);
    boolean b10 = book0.isAvailable();
    book0.setAvailable(true);
    boolean b13 = book0.isAvailable();
    book0.setAvailable(true);
    book0.setAvailable(false);
    java.lang.String str18 = book0.getISBN();
    book0.setAvailable(false);
    boolean b21 = book0.isAvailable();
    book0.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test135"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getAuthor();
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test136"); }

    Book book0 = new Book();
    boolean b1 = book0.isAvailable();
    java.lang.String str2 = book0.getISBN();
    java.lang.String str3 = book0.getISBN();
    java.lang.String str4 = book0.getTitle();
    java.lang.String str5 = book0.getAuthor();
    java.lang.String str6 = book0.getAuthor();
    book0.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test137"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str15 = book3.getISBN();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test138"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test139"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test140"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(true);
    boolean b14 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str17 = book3.getTitle();
    boolean b18 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test141"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    boolean b10 = book3.isAvailable();
    book3.setAvailable(true);
    book3.setAvailable(false);
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test142"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str6 = book0.getTitle();
    java.lang.String str7 = book0.getAuthor();
    java.lang.String str8 = book0.getAuthor();
    java.lang.String str9 = book0.getISBN();
    boolean b10 = book0.isAvailable();
    java.lang.String str11 = book0.getISBN();
    book0.setAvailable(false);
    java.lang.String str14 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test143"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test144"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(false);
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getTitle();
    book3.setAvailable(true);
    boolean b19 = book3.isAvailable();
    java.lang.String str20 = book3.getISBN();
    java.lang.String str21 = book3.getTitle();
    java.lang.String str22 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test145"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getTitle();
    java.lang.String str5 = book3.getTitle();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test146"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    boolean b12 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str17 = book3.getTitle();
    java.lang.String str18 = book3.getAuthor();
    java.lang.String str19 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test147"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str7 = book0.getTitle();
    java.lang.String str8 = book0.getISBN();
    java.lang.String str9 = book0.getTitle();
    java.lang.String str10 = book0.getTitle();
    java.lang.String str11 = book0.getTitle();
    java.lang.String str12 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str15 = book0.getISBN();
    java.lang.String str16 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test148"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str18 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test149"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test150"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getAuthor();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test151"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(false);
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str20 = book3.getISBN();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test152"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(true);
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test153"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getAuthor();
    java.lang.String str18 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(true);
    boolean b23 = book3.isAvailable();
    java.lang.String str24 = book3.getISBN();
    java.lang.String str25 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test154"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(true);
    book3.setAvailable(false);
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test155"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test156"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str15 = book3.getTitle();
    boolean b16 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str19 = book3.getAuthor();
    java.lang.String str20 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test157"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getISBN();
    book3.setAvailable(true);
    boolean b7 = book3.isAvailable();
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test158"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test159"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    boolean b6 = book3.isAvailable();
    boolean b7 = book3.isAvailable();
    java.lang.String str8 = book3.getAuthor();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test160"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    book0.setAvailable(true);
    java.lang.String str7 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str10 = book0.getAuthor();
    java.lang.String str11 = book0.getTitle();
    java.lang.String str12 = book0.getAuthor();
    book0.setAvailable(false);
    java.lang.String str15 = book0.getISBN();
    java.lang.String str16 = book0.getTitle();
    boolean b17 = book0.isAvailable();
    java.lang.String str18 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test161"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getTitle();
    boolean b5 = book0.isAvailable();
    java.lang.String str6 = book0.getTitle();
    java.lang.String str7 = book0.getTitle();
    book0.setAvailable(true);
    java.lang.String str10 = book0.getAuthor();
    book0.setAvailable(false);
    java.lang.String str13 = book0.getTitle();
    boolean b14 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test162"); }

    Book book0 = new Book();
    book0.setAvailable(true);
    boolean b3 = book0.isAvailable();
    book0.setAvailable(true);
    boolean b6 = book0.isAvailable();
    java.lang.String str7 = book0.getAuthor();
    java.lang.String str8 = book0.getAuthor();
    java.lang.String str9 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test163"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getAuthor();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test164"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str24 = book3.getISBN();
    boolean b25 = book3.isAvailable();
    boolean b26 = book3.isAvailable();
    java.lang.String str27 = book3.getTitle();
    java.lang.String str28 = book3.getISBN();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test165"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getTitle();
    boolean b11 = book3.isAvailable();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test166"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str18 = book3.getAuthor();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test167"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test168"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    book0.setAvailable(false);
    java.lang.String str6 = book0.getAuthor();
    java.lang.String str7 = book0.getTitle();
    boolean b8 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test169"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getAuthor();
    boolean b15 = book3.isAvailable();
    book3.setAvailable(false);
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test170"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    boolean b13 = book3.isAvailable();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test171"); }

    Book book3 = new Book("hi!", "", "hi!");
    boolean b4 = book3.isAvailable();
    java.lang.String str5 = book3.getISBN();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test172"); }

    Book book3 = new Book("hi!", "", "hi!");
    boolean b4 = book3.isAvailable();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    book3.setAvailable(false);
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test173"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str17 = book3.getTitle();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test174"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getTitle();
    boolean b17 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test175"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getTitle();
    boolean b15 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test176"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(false);
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str21 = book3.getTitle();
    boolean b22 = book3.isAvailable();
    java.lang.String str23 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test177"); }

    Book book3 = new Book("", "", "");
    java.lang.String str4 = book3.getAuthor();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getISBN();
    java.lang.String str8 = book3.getTitle();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test178"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    boolean b14 = book3.isAvailable();
    boolean b15 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test179"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    book3.setAvailable(false);
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str16 = book3.getTitle();
    book3.setAvailable(true);
    boolean b19 = book3.isAvailable();
    java.lang.String str20 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str23 = book3.getISBN();
    java.lang.String str24 = book3.getAuthor();
    java.lang.String str25 = book3.getISBN();
    java.lang.String str26 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test180"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getTitle();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getTitle();
    book3.setAvailable(false);
    boolean b16 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str19 = book3.getAuthor();
    java.lang.String str20 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test181"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test182"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str18 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test183"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getTitle();
    boolean b20 = book3.isAvailable();
    java.lang.String str21 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test184"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test185"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str16 = book3.getAuthor();
    boolean b17 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test186"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test187"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str15 = book3.getTitle();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test188"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    boolean b10 = book3.isAvailable();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str15 = book3.getTitle();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getAuthor();
    java.lang.String str18 = book3.getISBN();
    boolean b19 = book3.isAvailable();
    boolean b20 = book3.isAvailable();
    java.lang.String str21 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test189"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getISBN();
    boolean b8 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str16 = book3.getAuthor();
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getTitle();
    java.lang.String str19 = book3.getISBN();
    java.lang.String str20 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(false);
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test190"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    boolean b14 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test191"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getTitle();
    book3.setAvailable(false);
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test192"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    boolean b10 = book3.isAvailable();
    boolean b11 = book3.isAvailable();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getTitle();
    boolean b17 = book3.isAvailable();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test193"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str20 = book3.getISBN();
    boolean b21 = book3.isAvailable();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test194"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    java.lang.String str6 = book3.getISBN();
    boolean b7 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str13 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getTitle();
    java.lang.String str18 = book3.getISBN();
    boolean b19 = book3.isAvailable();
    boolean b20 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test195"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getISBN();
    boolean b16 = book3.isAvailable();
    book3.setAvailable(true);
    boolean b19 = book3.isAvailable();
    java.lang.String str20 = book3.getTitle();
    boolean b21 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test196"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(false);
    boolean b14 = book3.isAvailable();
    boolean b15 = book3.isAvailable();
    boolean b16 = book3.isAvailable();
    book3.setAvailable(false);
    boolean b19 = book3.isAvailable();
    boolean b20 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test197"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getISBN();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test198"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    boolean b3 = book0.isAvailable();
    java.lang.String str4 = book0.getISBN();
    java.lang.String str5 = book0.getISBN();
    java.lang.String str6 = book0.getISBN();
    java.lang.String str7 = book0.getAuthor();
    book0.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test199"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test200"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test201"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str12 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test202"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getTitle();
    book3.setAvailable(true);
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test203"); }

    Book book0 = new Book();
    boolean b1 = book0.isAvailable();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str6 = book0.getAuthor();
    boolean b7 = book0.isAvailable();
    boolean b8 = book0.isAvailable();
    java.lang.String str9 = book0.getAuthor();
    java.lang.String str10 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test204"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    book0.setAvailable(false);
    java.lang.String str6 = book0.getTitle();
    boolean b7 = book0.isAvailable();
    java.lang.String str8 = book0.getISBN();
    boolean b9 = book0.isAvailable();
    book0.setAvailable(false);
    book0.setAvailable(true);
    book0.setAvailable(true);
    book0.setAvailable(true);
    boolean b18 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test205"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(true);
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getTitle();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test206"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getISBN();
    boolean b17 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test207"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getAuthor();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test208"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getISBN();
    book3.setAvailable(false);
    boolean b17 = book3.isAvailable();
    java.lang.String str18 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test209"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    book3.setAvailable(true);
    book3.setAvailable(false);
    boolean b18 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test210"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str16 = book3.getAuthor();
    java.lang.String str17 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test211"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    book3.setAvailable(false);
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getTitle();
    boolean b17 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str20 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test212"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getTitle();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str13 = book3.getISBN();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getTitle();
    boolean b17 = book3.isAvailable();
    java.lang.String str18 = book3.getISBN();
    boolean b19 = book3.isAvailable();
    java.lang.String str20 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test213"); }

    Book book3 = new Book("", "", "");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test214"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test215"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str17 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test216"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    boolean b14 = book3.isAvailable();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getTitle();
    boolean b17 = book3.isAvailable();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str22 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test217"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getISBN();
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str15 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test218"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    book3.setAvailable(false);
    boolean b17 = book3.isAvailable();
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getTitle();
    java.lang.String str20 = book3.getISBN();
    java.lang.String str21 = book3.getISBN();
    boolean b22 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test219"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str9 = book3.getTitle();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getTitle();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test220"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    java.lang.String str6 = book3.getISBN();
    boolean b7 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getTitle();
    book3.setAvailable(false);
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getAuthor();
    java.lang.String str20 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str23 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test221"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str15 = book3.getTitle();
    boolean b16 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test222"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    boolean b10 = book3.isAvailable();
    boolean b11 = book3.isAvailable();
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test223"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str15 = book3.getTitle();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test224"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test225"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getISBN();
    boolean b16 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str21 = book3.getTitle();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str26 = book3.getISBN();
    boolean b27 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test226"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getAuthor();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test227"); }

    Book book3 = new Book("hi!", "", "hi!");
    java.lang.String str4 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str15 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str18 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test228"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getAuthor();
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getTitle();
    java.lang.String str20 = book3.getAuthor();
    boolean b21 = book3.isAvailable();
    java.lang.String str22 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test229"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getTitle();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test230"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getTitle();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getISBN();
    java.lang.String str20 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test231"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    book0.setAvailable(true);
    java.lang.String str7 = book0.getAuthor();
    java.lang.String str8 = book0.getTitle();
    java.lang.String str9 = book0.getAuthor();
    java.lang.String str10 = book0.getTitle();
    java.lang.String str11 = book0.getISBN();
    java.lang.String str12 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test232"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    book3.setAvailable(false);
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str16 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str19 = book3.getTitle();
    java.lang.String str20 = book3.getISBN();
    boolean b21 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test233"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getTitle();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test234"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test235"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getAuthor();
    book3.setAvailable(true);
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str17 = book3.getAuthor();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getAuthor();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test236"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str6 = book0.getISBN();
    boolean b7 = book0.isAvailable();
    book0.setAvailable(false);
    java.lang.String str10 = book0.getAuthor();
    java.lang.String str11 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test237"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getAuthor();
    boolean b17 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test238"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getISBN();
    java.lang.String str8 = book3.getTitle();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test239"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(true);
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test240"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test241"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(true);
    boolean b24 = book3.isAvailable();
    java.lang.String str25 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test242"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getTitle();
    java.lang.String str5 = book0.getISBN();
    java.lang.String str6 = book0.getTitle();
    boolean b7 = book0.isAvailable();
    book0.setAvailable(true);
    java.lang.String str10 = book0.getTitle();
    java.lang.String str11 = book0.getAuthor();
    boolean b12 = book0.isAvailable();
    book0.setAvailable(true);
    boolean b15 = book0.isAvailable();
    java.lang.String str16 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test243"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getAuthor();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test244"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getAuthor();
    book3.setAvailable(false);
    boolean b19 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test245"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getAuthor();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getAuthor();
    java.lang.String str18 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str21 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test246"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test247"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    boolean b7 = book3.isAvailable();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test248"); }

    Book book0 = new Book();
    book0.setAvailable(true);
    boolean b3 = book0.isAvailable();
    book0.setAvailable(true);
    boolean b6 = book0.isAvailable();
    java.lang.String str7 = book0.getISBN();
    boolean b8 = book0.isAvailable();
    java.lang.String str9 = book0.getTitle();
    boolean b10 = book0.isAvailable();
    boolean b11 = book0.isAvailable();
    boolean b12 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test249"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getAuthor();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getTitle();
    boolean b11 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getAuthor();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test250"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    book3.setAvailable(false);
    boolean b10 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test251"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str20 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str23 = book3.getTitle();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test252"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test253"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getISBN();
    boolean b16 = book3.isAvailable();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test254"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str6 = book0.getTitle();
    java.lang.String str7 = book0.getISBN();
    boolean b8 = book0.isAvailable();
    java.lang.String str9 = book0.getAuthor();
    book0.setAvailable(false);
    java.lang.String str12 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test255"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test256"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getISBN();
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getTitle();
    boolean b11 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getTitle();
    java.lang.String str18 = book3.getAuthor();
    java.lang.String str19 = book3.getAuthor();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test257"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test258"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test259"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str12 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test260"); }

    Book book0 = new Book();
    boolean b1 = book0.isAvailable();
    java.lang.String str2 = book0.getTitle();
    book0.setAvailable(true);
    java.lang.String str5 = book0.getTitle();
    java.lang.String str6 = book0.getAuthor();
    java.lang.String str7 = book0.getAuthor();
    java.lang.String str8 = book0.getISBN();
    boolean b9 = book0.isAvailable();
    book0.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test261"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(false);
    boolean b15 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test262"); }

    Book book3 = new Book("hi!", "", "hi!");
    java.lang.String str4 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str7 = book3.getAuthor();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test263"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    boolean b14 = book3.isAvailable();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test264"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    book3.setAvailable(false);
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str16 = book3.getTitle();
    book3.setAvailable(true);
    boolean b19 = book3.isAvailable();
    java.lang.String str20 = book3.getAuthor();
    java.lang.String str21 = book3.getTitle();
    java.lang.String str22 = book3.getISBN();
    java.lang.String str23 = book3.getTitle();
    java.lang.String str24 = book3.getAuthor();
    java.lang.String str25 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test265"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test266"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str6 = book0.getTitle();
    book0.setAvailable(true);
    book0.setAvailable(false);
    java.lang.String str11 = book0.getTitle();
    boolean b12 = book0.isAvailable();
    book0.setAvailable(false);
    boolean b15 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test267"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getISBN();
    boolean b15 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getTitle();
    java.lang.String str20 = book3.getTitle();
    java.lang.String str21 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test268"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getTitle();
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getAuthor();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test269"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str17 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test270"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test271"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    boolean b13 = book3.isAvailable();
    book3.setAvailable(false);
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test272"); }

    Book book0 = new Book();
    boolean b1 = book0.isAvailable();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str6 = book0.getAuthor();
    java.lang.String str7 = book0.getISBN();
    java.lang.String str8 = book0.getTitle();
    boolean b9 = book0.isAvailable();
    boolean b10 = book0.isAvailable();
    book0.setAvailable(true);
    java.lang.String str13 = book0.getTitle();
    boolean b14 = book0.isAvailable();
    java.lang.String str15 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test273"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    java.lang.String str5 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getISBN();
    boolean b10 = book3.isAvailable();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test274"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test275"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getTitle();
    java.lang.String str5 = book0.getISBN();
    book0.setAvailable(true);
    book0.setAvailable(true);
    java.lang.String str10 = book0.getAuthor();
    book0.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test276"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str18 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test277"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getTitle();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test278"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getAuthor();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test279"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test280"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getISBN();
    boolean b11 = book3.isAvailable();
    boolean b12 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test281"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    boolean b5 = book0.isAvailable();
    java.lang.String str6 = book0.getISBN();
    book0.setAvailable(false);
    java.lang.String str9 = book0.getAuthor();
    boolean b10 = book0.isAvailable();
    boolean b11 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test282"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getISBN();
    boolean b2 = book0.isAvailable();
    boolean b3 = book0.isAvailable();
    boolean b4 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test283"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    boolean b15 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str20 = book3.getAuthor();
    java.lang.String str21 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test284"); }

    Book book3 = new Book("", "", "");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getAuthor();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test285"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str15 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test286"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test287"); }

    Book book0 = new Book();
    boolean b1 = book0.isAvailable();
    java.lang.String str2 = book0.getISBN();
    boolean b3 = book0.isAvailable();
    boolean b4 = book0.isAvailable();
    java.lang.String str5 = book0.getAuthor();
    java.lang.String str6 = book0.getAuthor();
    book0.setAvailable(false);
    boolean b9 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test288"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getAuthor();
    boolean b17 = book3.isAvailable();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getISBN();
    java.lang.String str20 = book3.getISBN();
    java.lang.String str21 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test289"); }

    Book book3 = new Book("", "", "");
    java.lang.String str4 = book3.getAuthor();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getISBN();
    java.lang.String str8 = book3.getAuthor();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test290"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test291"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getAuthor();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getISBN();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test292"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getISBN();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test293"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(true);
    boolean b15 = book3.isAvailable();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getTitle();
    book3.setAvailable(true);
    boolean b20 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test294"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getTitle();
    java.lang.String str18 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test295"); }

    Book book3 = new Book("", "", "hi!");
    boolean b4 = book3.isAvailable();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test296"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(false);
    book3.setAvailable(true);
    boolean b26 = book3.isAvailable();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test297"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getTitle();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str13 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str16 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test298"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getAuthor();
    boolean b16 = book3.isAvailable();
    boolean b17 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test299"); }

    Book book3 = new Book("hi!", "", "hi!");
    boolean b4 = book3.isAvailable();
    java.lang.String str5 = book3.getTitle();
    java.lang.String str6 = book3.getTitle();
    book3.setAvailable(false);
    boolean b9 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test300"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    boolean b14 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b19 = book3.isAvailable();
    boolean b20 = book3.isAvailable();
    java.lang.String str21 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test301"); }

    Book book3 = new Book("", "", "");
    boolean b4 = book3.isAvailable();
    book3.setAvailable(true);
    book3.setAvailable(false);
    boolean b9 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test302"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test303"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test304"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getAuthor();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test305"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test306"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str17 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test307"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getTitle();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test308"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str15 = book3.getAuthor();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test309"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getISBN();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test310"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getISBN();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getTitle();
    boolean b18 = book3.isAvailable();
    boolean b19 = book3.isAvailable();
    boolean b20 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test311"); }

    Book book0 = new Book();
    boolean b1 = book0.isAvailable();
    java.lang.String str2 = book0.getAuthor();
    java.lang.String str3 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test312"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    boolean b7 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test313"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getAuthor();
    boolean b12 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str15 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test314"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(true);
    book3.setAvailable(true);
    book3.setAvailable(true);
    boolean b16 = book3.isAvailable();
    boolean b17 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test315"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getTitle();
    boolean b12 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getTitle();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test316"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str9 = book3.getTitle();
    boolean b10 = book3.isAvailable();
    book3.setAvailable(true);
    book3.setAvailable(true);
    boolean b15 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test317"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getAuthor();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test318"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getTitle();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getISBN();
    book3.setAvailable(false);
    boolean b20 = book3.isAvailable();
    java.lang.String str21 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test319"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test320"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getAuthor();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getAuthor();
    boolean b17 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str20 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test321"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str19 = book3.getISBN();
    java.lang.String str20 = book3.getTitle();
    boolean b21 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test322"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str6 = book0.getISBN();
    java.lang.String str7 = book0.getTitle();
    java.lang.String str8 = book0.getISBN();
    java.lang.String str9 = book0.getTitle();
    java.lang.String str10 = book0.getTitle();
    java.lang.String str11 = book0.getAuthor();
    book0.setAvailable(false);
    java.lang.String str14 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test323"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str20 = book3.getISBN();
    java.lang.String str21 = book3.getTitle();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str26 = book3.getTitle();
    java.lang.String str27 = book3.getISBN();
    boolean b28 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test324"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    java.lang.String str5 = book0.getTitle();
    java.lang.String str6 = book0.getAuthor();
    java.lang.String str7 = book0.getTitle();
    java.lang.String str8 = book0.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test325"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test326"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getTitle();
    boolean b5 = book0.isAvailable();
    java.lang.String str6 = book0.getTitle();
    java.lang.String str7 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str10 = book0.getAuthor();
    java.lang.String str11 = book0.getAuthor();
    java.lang.String str12 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test327"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(true);
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getISBN();
    boolean b16 = book3.isAvailable();
    boolean b17 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test328"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getAuthor();
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getISBN();
    java.lang.String str20 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test329"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(true);
    boolean b14 = book3.isAvailable();
    boolean b15 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test330"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getTitle();
    boolean b10 = book3.isAvailable();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test331"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getISBN();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test332"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test333"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getISBN();
    boolean b17 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test334"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(false);
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test335"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test336"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test337"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test338"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor();
    java.lang.String str2 = book0.getAuthor();
    boolean b3 = book0.isAvailable();
    java.lang.String str4 = book0.getISBN();
    java.lang.String str5 = book0.getISBN();
    book0.setAvailable(false);
    java.lang.String str8 = book0.getAuthor();
    java.lang.String str9 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test339"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str13 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str16 = book3.getTitle();
    boolean b17 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test340"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    book0.setAvailable(false);
    java.lang.String str6 = book0.getAuthor();
    java.lang.String str7 = book0.getTitle();
    java.lang.String str8 = book0.getISBN();
    boolean b9 = book0.isAvailable();
    book0.setAvailable(true);
    java.lang.String str12 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str15 = book0.getTitle();
    boolean b16 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test341"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getTitle();
    boolean b16 = book3.isAvailable();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test342"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getTitle();
    boolean b5 = book0.isAvailable();
    java.lang.String str6 = book0.getTitle();
    java.lang.String str7 = book0.getTitle();
    book0.setAvailable(false);
    boolean b10 = book0.isAvailable();
    boolean b11 = book0.isAvailable();
    java.lang.String str12 = book0.getTitle();
    java.lang.String str13 = book0.getTitle();
    java.lang.String str14 = book0.getAuthor();
    java.lang.String str15 = book0.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test343"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str17 = book3.getTitle();
    java.lang.String str18 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test344"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test345"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    book3.setAvailable(false);
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getAuthor();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test346"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str7 = book3.getISBN();
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    boolean b12 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test347"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str6 = book0.getTitle();
    java.lang.String str7 = book0.getAuthor();
    java.lang.String str8 = book0.getAuthor();
    java.lang.String str9 = book0.getISBN();
    java.lang.String str10 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str13 = book0.getISBN();
    boolean b14 = book0.isAvailable();
    java.lang.String str15 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test348"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    boolean b12 = book3.isAvailable();
    book3.setAvailable(true);
    boolean b15 = book3.isAvailable();
    boolean b16 = book3.isAvailable();
    book3.setAvailable(true);
    boolean b19 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test349"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getISBN();
    boolean b14 = book3.isAvailable();
    boolean b15 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str18 = book3.getAuthor();
    java.lang.String str19 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test350"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getTitle();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test351"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    book0.setAvailable(true);
    book0.setAvailable(false);
    java.lang.String str8 = book0.getISBN();
    boolean b9 = book0.isAvailable();
    book0.setAvailable(true);
    boolean b12 = book0.isAvailable();
    java.lang.String str13 = book0.getTitle();
    java.lang.String str14 = book0.getISBN();
    java.lang.String str15 = book0.getISBN();
    java.lang.String str16 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test352"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str16 = book3.getISBN();
    boolean b17 = book3.isAvailable();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test353"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getTitle();
    java.lang.String str20 = book3.getTitle();
    java.lang.String str21 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str24 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test354"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getAuthor();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test355"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getISBN();
    java.lang.String str20 = book3.getAuthor();
    book3.setAvailable(false);
    boolean b23 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str26 = book3.getTitle();
    java.lang.String str27 = book3.getTitle();
    java.lang.String str28 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test356"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test357"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getTitle();
    java.lang.String str5 = book0.getISBN();
    java.lang.String str6 = book0.getISBN();
    java.lang.String str7 = book0.getAuthor();
    java.lang.String str8 = book0.getISBN();
    java.lang.String str9 = book0.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test358"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getAuthor();
    java.lang.String str18 = book3.getAuthor();
    java.lang.String str19 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b24 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test359"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getAuthor();
    boolean b14 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test360"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str16 = book3.getAuthor();
    java.lang.String str17 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str20 = book3.getTitle();
    book3.setAvailable(false);
    boolean b23 = book3.isAvailable();
    java.lang.String str24 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test361"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    book0.setAvailable(true);
    java.lang.String str7 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str10 = book0.getISBN();
    book0.setAvailable(true);
    java.lang.String str13 = book0.getISBN();
    java.lang.String str14 = book0.getAuthor();
    java.lang.String str15 = book0.getTitle();
    book0.setAvailable(false);
    boolean b18 = book0.isAvailable();
    java.lang.String str19 = book0.getAuthor();
    boolean b20 = book0.isAvailable();
    java.lang.String str21 = book0.getTitle();
    boolean b22 = book0.isAvailable();
    java.lang.String str23 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test362"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getTitle();
    boolean b5 = book0.isAvailable();
    java.lang.String str6 = book0.getTitle();
    java.lang.String str7 = book0.getTitle();
    book0.setAvailable(true);
    java.lang.String str10 = book0.getAuthor();
    book0.setAvailable(false);
    book0.setAvailable(true);
    java.lang.String str15 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test363"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    book3.setAvailable(true);
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b21 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test364"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getAuthor();
    boolean b14 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str17 = book3.getTitle();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test365"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getTitle();
    boolean b16 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str19 = book3.getISBN();
    java.lang.String str20 = book3.getTitle();
    java.lang.String str21 = book3.getISBN();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test366"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str13 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str18 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str21 = book3.getTitle();
    java.lang.String str22 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test367"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test368"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getISBN();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test369"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test370"); }

    Book book0 = new Book();
    book0.setAvailable(true);
    boolean b3 = book0.isAvailable();
    book0.setAvailable(true);
    boolean b6 = book0.isAvailable();
    java.lang.String str7 = book0.getISBN();
    boolean b8 = book0.isAvailable();
    java.lang.String str9 = book0.getTitle();
    java.lang.String str10 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test371"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str15 = book3.getISBN();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str20 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test372"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str6 = book0.getTitle();
    java.lang.String str7 = book0.getAuthor();
    boolean b8 = book0.isAvailable();
    java.lang.String str9 = book0.getISBN();
    java.lang.String str10 = book0.getTitle();
    boolean b11 = book0.isAvailable();
    java.lang.String str12 = book0.getTitle();
    boolean b13 = book0.isAvailable();
    book0.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test373"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test374"); }

    Book book0 = new Book();
    book0.setAvailable(true);
    book0.setAvailable(false);
    java.lang.String str5 = book0.getAuthor();
    book0.setAvailable(true);
    book0.setAvailable(false);
    book0.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test375"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getAuthor();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test376"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    boolean b5 = book0.isAvailable();
    java.lang.String str6 = book0.getISBN();
    book0.setAvailable(false);
    java.lang.String str9 = book0.getISBN();
    java.lang.String str10 = book0.getTitle();
    boolean b11 = book0.isAvailable();
    book0.setAvailable(false);
    java.lang.String str14 = book0.getAuthor();
    java.lang.String str15 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test377"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str6 = book0.getTitle();
    book0.setAvailable(true);
    book0.setAvailable(false);
    java.lang.String str11 = book0.getISBN();
    book0.setAvailable(true);
    java.lang.String str14 = book0.getAuthor();
    java.lang.String str15 = book0.getTitle();
    java.lang.String str16 = book0.getTitle();
    java.lang.String str17 = book0.getAuthor();
    java.lang.String str18 = book0.getTitle();
    java.lang.String str19 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test378"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(false);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getAuthor();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test379"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getISBN();
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getTitle();
    java.lang.String str19 = book3.getAuthor();
    java.lang.String str20 = book3.getTitle();
    boolean b21 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test380"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getAuthor();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test381"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test382"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getAuthor();
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test383"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getTitle();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getAuthor();
    java.lang.String str20 = book3.getAuthor();
    java.lang.String str21 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str24 = book3.getISBN();
    java.lang.String str25 = book3.getTitle();
    java.lang.String str26 = book3.getISBN();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test384"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str17 = book3.getAuthor();
    boolean b18 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str21 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test385"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    book3.setAvailable(true);
    boolean b17 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test386"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getTitle();
    boolean b4 = book0.isAvailable();
    book0.setAvailable(false);
    java.lang.String str7 = book0.getTitle();
    java.lang.String str8 = book0.getISBN();
    java.lang.String str9 = book0.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test387"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getTitle();
    java.lang.String str5 = book0.getISBN();
    java.lang.String str6 = book0.getTitle();
    java.lang.String str7 = book0.getISBN();
    boolean b8 = book0.isAvailable();
    java.lang.String str9 = book0.getISBN();
    java.lang.String str10 = book0.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test388"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    boolean b7 = book3.isAvailable();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    book3.setAvailable(false);
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str16 = book3.getISBN();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test389"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getTitle();
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getISBN();
    boolean b16 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test390"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(false);
    boolean b15 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getAuthor();
    book3.setAvailable(false);
    boolean b22 = book3.isAvailable();
    java.lang.String str23 = book3.getAuthor();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test391"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(false);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test392"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(false);
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getAuthor();
    java.lang.String str17 = book3.getAuthor();
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test393"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str16 = book3.getAuthor();
    boolean b17 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test394"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    java.lang.String str3 = book0.getAuthor();
    boolean b4 = book0.isAvailable();
    boolean b5 = book0.isAvailable();
    boolean b6 = book0.isAvailable();
    java.lang.String str7 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test395"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getAuthor();
    java.lang.String str17 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test396"); }

    Book book3 = new Book("hi!", "", "hi!");
    java.lang.String str4 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(false);
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getTitle();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    boolean b22 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test397"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getAuthor();
    java.lang.String str17 = book3.getAuthor();
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getISBN();
    boolean b20 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test398"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getAuthor();
    book3.setAvailable(false);
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test399"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test400"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getAuthor();
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getISBN();
    boolean b20 = book3.isAvailable();
    java.lang.String str21 = book3.getISBN();
    boolean b22 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test401"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getAuthor();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getAuthor();
    java.lang.String str17 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test402"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    java.lang.String str8 = book3.getAuthor();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test403"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    book3.setAvailable(false);
    boolean b17 = book3.isAvailable();
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getTitle();
    java.lang.String str20 = book3.getISBN();
    java.lang.String str21 = book3.getTitle();
    java.lang.String str22 = book3.getISBN();
    java.lang.String str23 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str26 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test404"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getISBN();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test405"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getAuthor();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test406"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    java.lang.String str6 = book3.getISBN();
    boolean b7 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test407"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getAuthor();
    java.lang.String str18 = book3.getAuthor();
    book3.setAvailable(true);
    boolean b21 = book3.isAvailable();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test408"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getISBN();
    java.lang.String str4 = book0.getTitle();
    book0.setAvailable(false);
    book0.setAvailable(false);
    java.lang.String str9 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test409"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    boolean b10 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test410"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    boolean b12 = book3.isAvailable();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test411"); }

    Book book3 = new Book("hi!", "", "");
    boolean b4 = book3.isAvailable();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    boolean b7 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test412"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    boolean b7 = book3.isAvailable();
    java.lang.String str8 = book3.getAuthor();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getISBN();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test413"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getISBN();
    boolean b20 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test414"); }

    Book book0 = new Book();
    boolean b1 = book0.isAvailable();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str6 = book0.getAuthor();
    java.lang.String str7 = book0.getTitle();
    java.lang.String str8 = book0.getISBN();
    boolean b9 = book0.isAvailable();
    book0.setAvailable(true);
    java.lang.String str12 = book0.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test415"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str6 = book0.getTitle();
    book0.setAvailable(true);
    book0.setAvailable(false);
    java.lang.String str11 = book0.getISBN();
    java.lang.String str12 = book0.getTitle();
    java.lang.String str13 = book0.getAuthor();
    java.lang.String str14 = book0.getISBN();
    java.lang.String str15 = book0.getAuthor();
    java.lang.String str16 = book0.getTitle();
    java.lang.String str17 = book0.getTitle();
    java.lang.String str18 = book0.getISBN();
    boolean b19 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test416"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test417"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getAuthor();
    java.lang.String str20 = book3.getAuthor();
    boolean b21 = book3.isAvailable();
    java.lang.String str22 = book3.getISBN();
    boolean b23 = book3.isAvailable();
    java.lang.String str24 = book3.getAuthor();
    java.lang.String str25 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test418"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getISBN();
    boolean b18 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test419"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getTitle();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test420"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    book3.setAvailable(true);
    boolean b17 = book3.isAvailable();
    java.lang.String str18 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str21 = book3.getAuthor();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test421"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str12 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str20 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str25 = book3.getISBN();
    java.lang.String str26 = book3.getISBN();
    java.lang.String str27 = book3.getAuthor();
    boolean b28 = book3.isAvailable();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test422"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getISBN();
    book3.setAvailable(false);
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getISBN();
    boolean b16 = book3.isAvailable();
    boolean b17 = book3.isAvailable();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test423"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getISBN();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test424"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    boolean b4 = book3.isAvailable();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getAuthor();
    boolean b8 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test425"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    boolean b10 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getTitle();
    boolean b17 = book3.isAvailable();
    java.lang.String str18 = book3.getTitle();
    boolean b19 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test426"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    book3.setAvailable(false);
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str18 = book3.getAuthor();
    java.lang.String str19 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test427"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    book0.setAvailable(true);
    java.lang.String str7 = book0.getAuthor();
    book0.setAvailable(true);
    boolean b10 = book0.isAvailable();
    java.lang.String str11 = book0.getTitle();
    java.lang.String str12 = book0.getAuthor();
    java.lang.String str13 = book0.getISBN();
    book0.setAvailable(false);
    boolean b16 = book0.isAvailable();
    book0.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test428"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(false);
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(true);
    boolean b14 = book3.isAvailable();
    book3.setAvailable(true);
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test429"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getAuthor();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getAuthor();
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getTitle();
    book3.setAvailable(false);
    boolean b21 = book3.isAvailable();
    java.lang.String str22 = book3.getISBN();
    boolean b23 = book3.isAvailable();
    java.lang.String str24 = book3.getISBN();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test430"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getAuthor();
    boolean b13 = book3.isAvailable();
    boolean b14 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str17 = book3.getAuthor();
    boolean b18 = book3.isAvailable();
    boolean b19 = book3.isAvailable();
    boolean b20 = book3.isAvailable();
    boolean b21 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test431"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getTitle();
    boolean b7 = book3.isAvailable();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getISBN();
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test432"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    boolean b12 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test433"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getISBN();
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test434"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getTitle();
    java.lang.String str18 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test435"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    boolean b11 = book3.isAvailable();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test436"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getAuthor();
    boolean b5 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test437"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test438"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    boolean b8 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test439"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    java.lang.String str5 = book0.getAuthor();
    book0.setAvailable(true);
    boolean b8 = book0.isAvailable();
    java.lang.String str9 = book0.getTitle();
    boolean b10 = book0.isAvailable();
    java.lang.String str11 = book0.getAuthor();
    java.lang.String str12 = book0.getTitle();
    java.lang.String str13 = book0.getAuthor();
    boolean b14 = book0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test440"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getISBN();
    book3.setAvailable(false);
    boolean b16 = book3.isAvailable();
    java.lang.String str17 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test441"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str16 = book3.getAuthor();
    java.lang.String str17 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str20 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test442"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getAuthor();
    boolean b13 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test443"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test444"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getAuthor();
    boolean b5 = book0.isAvailable();
    boolean b6 = book0.isAvailable();
    java.lang.String str7 = book0.getTitle();
    book0.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test445"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getISBN();
    java.lang.String str14 = book3.getISBN();
    book3.setAvailable(false);
    boolean b17 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test446"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    book0.setAvailable(true);
    java.lang.String str7 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str10 = book0.getISBN();
    book0.setAvailable(true);
    java.lang.String str13 = book0.getISBN();
    java.lang.String str14 = book0.getAuthor();
    java.lang.String str15 = book0.getTitle();
    book0.setAvailable(false);
    boolean b18 = book0.isAvailable();
    java.lang.String str19 = book0.getAuthor();
    java.lang.String str20 = book0.getISBN();
    book0.setAvailable(false);
    book0.setAvailable(false);
    java.lang.String str25 = book0.getAuthor();
    java.lang.String str26 = book0.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test447"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test448"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test449"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getAuthor();
    boolean b16 = book3.isAvailable();
    book3.setAvailable(true);
    boolean b19 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test450"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str21 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str24 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test451"); }

    Book book3 = new Book("", "hi!", "");
    book3.setAvailable(false);
    boolean b6 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(true);
    java.lang.String str11 = book3.getTitle();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test452"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    boolean b14 = book3.isAvailable();
    book3.setAvailable(true);
    book3.setAvailable(true);
    book3.setAvailable(false);
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test453"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getTitle();
    boolean b5 = book0.isAvailable();
    java.lang.String str6 = book0.getTitle();
    java.lang.String str7 = book0.getTitle();
    book0.setAvailable(false);
    book0.setAvailable(false);
    java.lang.String str12 = book0.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test454"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getAuthor();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test455"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    boolean b14 = book3.isAvailable();
    book3.setAvailable(true);
    book3.setAvailable(true);
    boolean b19 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test456"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getAuthor();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getTitle();
    book3.setAvailable(false);
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test457"); }

    Book book3 = new Book("", "", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    boolean b7 = book3.isAvailable();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getISBN();
    java.lang.String str13 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test458"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str16 = book3.getAuthor();
    boolean b17 = book3.isAvailable();
    boolean b18 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test459"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test460"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    book3.setAvailable(false);
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getAuthor();
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test461"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str6 = book0.getTitle();
    java.lang.String str7 = book0.getAuthor();
    java.lang.String str8 = book0.getAuthor();
    java.lang.String str9 = book0.getISBN();
    book0.setAvailable(true);
    book0.setAvailable(false);
    java.lang.String str14 = book0.getAuthor();
    java.lang.String str15 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test462"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getTitle();
    boolean b6 = book3.isAvailable();
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str11 = book3.getAuthor();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getTitle();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getAuthor();
    book3.setAvailable(true);
    boolean b18 = book3.isAvailable();
    java.lang.String str19 = book3.getAuthor();
    java.lang.String str20 = book3.getISBN();
    boolean b21 = book3.isAvailable();
    java.lang.String str22 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test463"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getAuthor();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test464"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getISBN();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getAuthor();
    java.lang.String str14 = book3.getAuthor();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getAuthor();
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getAuthor();
    java.lang.String str19 = book3.getTitle();
    java.lang.String str20 = book3.getISBN();
    java.lang.String str21 = book3.getISBN();
    boolean b22 = book3.isAvailable();
    java.lang.String str23 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test465"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getISBN();
    boolean b8 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str13 = book3.getISBN();
    book3.setAvailable(true);
    book3.setAvailable(false);
    book3.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test466"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    java.lang.String str4 = book0.getTitle();
    java.lang.String str5 = book0.getISBN();
    book0.setAvailable(true);
    java.lang.String str8 = book0.getAuthor();
    java.lang.String str9 = book0.getTitle();
    book0.setAvailable(true);
    java.lang.String str12 = book0.getISBN();
    java.lang.String str13 = book0.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test467"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor();
    book0.setAvailable(true);
    java.lang.String str6 = book0.getISBN();
    java.lang.String str7 = book0.getAuthor();
    java.lang.String str8 = book0.getAuthor();
    boolean b9 = book0.isAvailable();
    boolean b10 = book0.isAvailable();
    java.lang.String str11 = book0.getISBN();
    java.lang.String str12 = book0.getAuthor();
    book0.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test468"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getTitle();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    java.lang.String str10 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test469"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    java.lang.String str8 = book3.getISBN();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getAuthor();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test470"); }

    Book book3 = new Book("hi!", "", "hi!");
    java.lang.String str4 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test471"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    book0.setAvailable(true);
    java.lang.String str7 = book0.getAuthor();
    book0.setAvailable(true);
    boolean b10 = book0.isAvailable();
    java.lang.String str11 = book0.getAuthor();
    java.lang.String str12 = book0.getAuthor();
    boolean b13 = book0.isAvailable();
    java.lang.String str14 = book0.getISBN();
    java.lang.String str15 = book0.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test472"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getISBN();
    boolean b10 = book3.isAvailable();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getTitle();
    boolean b13 = book3.isAvailable();
    book3.setAvailable(false);
    java.lang.String str16 = book3.getTitle();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test473"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test474"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getISBN();
    java.lang.String str18 = book3.getISBN();
    java.lang.String str19 = book3.getAuthor();
    boolean b20 = book3.isAvailable();
    java.lang.String str21 = book3.getTitle();
    java.lang.String str22 = book3.getISBN();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test475"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    boolean b10 = book3.isAvailable();
    book3.setAvailable(true);
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getISBN();
    java.lang.String str15 = book3.getTitle();
    java.lang.String str16 = book3.getISBN();
    book3.setAvailable(false);
    java.lang.String str19 = book3.getAuthor();
    java.lang.String str20 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test476"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getAuthor();
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getAuthor();
    java.lang.String str17 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test477"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getTitle();
    boolean b12 = book3.isAvailable();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getAuthor();
    boolean b16 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test478"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    java.lang.String str9 = book3.getTitle();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getAuthor();
    java.lang.String str13 = book3.getTitle();
    book3.setAvailable(true);
    boolean b16 = book3.isAvailable();
    boolean b17 = book3.isAvailable();
    java.lang.String str18 = book3.getAuthor();
    java.lang.String str19 = book3.getTitle();
    boolean b20 = book3.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test479"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getTitle();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getISBN();
    java.lang.String str17 = book3.getAuthor();
    java.lang.String str18 = book3.getISBN();
    boolean b19 = book3.isAvailable();
    java.lang.String str20 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str23 = book3.getTitle();
    java.lang.String str24 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test480"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    book3.setAvailable(true);
    boolean b12 = book3.isAvailable();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getAuthor();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test481"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getAuthor();
    java.lang.String str9 = book3.getAuthor();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test482"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getISBN();
    boolean b11 = book3.isAvailable();
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test483"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    boolean b8 = book3.isAvailable();
    boolean b9 = book3.isAvailable();
    java.lang.String str10 = book3.getAuthor();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(false);
    java.lang.String str16 = book3.getAuthor();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test484"); }

    Book book0 = new Book();
    book0.setAvailable(true);
    book0.setAvailable(false);
    java.lang.String str5 = book0.getAuthor();
    book0.setAvailable(true);
    book0.setAvailable(false);
    book0.setAvailable(false);
    book0.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test485"); }

    Book book3 = new Book("hi!", "", "");
    boolean b4 = book3.isAvailable();
    java.lang.String str5 = book3.getISBN();
    java.lang.String str6 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str9 = book3.getTitle();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test486"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str12 = book3.getISBN();
    boolean b13 = book3.isAvailable();
    boolean b14 = book3.isAvailable();
    java.lang.String str15 = book3.getAuthor();
    book3.setAvailable(false);
    java.lang.String str18 = book3.getTitle();
    boolean b19 = book3.isAvailable();
    java.lang.String str20 = book3.getTitle();
    boolean b21 = book3.isAvailable();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test487"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getAuthor();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str19 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test488"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str6 = book0.getTitle();
    java.lang.String str7 = book0.getAuthor();
    boolean b8 = book0.isAvailable();
    java.lang.String str9 = book0.getAuthor();
    boolean b10 = book0.isAvailable();
    java.lang.String str11 = book0.getTitle();
    java.lang.String str12 = book0.getAuthor();
    java.lang.String str13 = book0.getAuthor();
    java.lang.String str14 = book0.getAuthor();
    java.lang.String str15 = book0.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test489"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    java.lang.String str5 = book0.getAuthor();
    book0.setAvailable(true);
    boolean b8 = book0.isAvailable();
    java.lang.String str9 = book0.getTitle();
    boolean b10 = book0.isAvailable();
    java.lang.String str11 = book0.getAuthor();
    java.lang.String str12 = book0.getAuthor();
    book0.setAvailable(false);
    book0.setAvailable(false);
    java.lang.String str17 = book0.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test490"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    java.lang.String str8 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getISBN();
    java.lang.String str12 = book3.getTitle();
    java.lang.String str13 = book3.getTitle();
    java.lang.String str14 = book3.getISBN();
    boolean b15 = book3.isAvailable();
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getISBN();
    book3.setAvailable(false);
    boolean b20 = book3.isAvailable();
    java.lang.String str21 = book3.getISBN();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test491"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getAuthor();
    book3.setAvailable(true);
    boolean b13 = book3.isAvailable();
    java.lang.String str14 = book3.getAuthor();
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test492"); }

    Book book3 = new Book("", "hi!", "hi!");
    java.lang.String str4 = book3.getAuthor();
    java.lang.String str5 = book3.getAuthor();
    java.lang.String str6 = book3.getTitle();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getAuthor();
    java.lang.String str10 = book3.getISBN();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(false);
    book3.setAvailable(false);
    java.lang.String str16 = book3.getTitle();
    java.lang.String str17 = book3.getTitle();
    boolean b18 = book3.isAvailable();
    boolean b19 = book3.isAvailable();
    java.lang.String str20 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test493"); }

    Book book3 = new Book("", "", "hi!");
    java.lang.String str4 = book3.getISBN();
    boolean b5 = book3.isAvailable();
    java.lang.String str6 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test494"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(false);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getISBN();
    java.lang.String str8 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str11 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getTitle();
    java.lang.String str15 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test495"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getISBN();
    java.lang.String str7 = book3.getAuthor();
    book3.setAvailable(true);
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getTitle();
    java.lang.String str12 = book3.getTitle();
    book3.setAvailable(true);
    java.lang.String str15 = book3.getISBN();
    java.lang.String str16 = book3.getAuthor();
    java.lang.String str17 = book3.getISBN();
    book3.setAvailable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test496"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getTitle();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getTitle();
    book0.setAvailable(false);
    java.lang.String str6 = book0.getISBN();
    book0.setAvailable(true);
    java.lang.String str9 = book0.getAuthor();
    java.lang.String str10 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test497"); }

    Book book3 = new Book("hi!", "hi!", "hi!");
    book3.setAvailable(false);
    boolean b6 = book3.isAvailable();
    java.lang.String str7 = book3.getAuthor();
    java.lang.String str8 = book3.getTitle();
    java.lang.String str9 = book3.getISBN();
    boolean b10 = book3.isAvailable();
    java.lang.String str11 = book3.getISBN();
    book3.setAvailable(true);
    java.lang.String str14 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test498"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    java.lang.String str6 = book3.getAuthor();
    java.lang.String str7 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str10 = book3.getTitle();
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(false);
    boolean b14 = book3.isAvailable();
    book3.setAvailable(false);
    book3.setAvailable(false);
    book3.setAvailable(true);
    boolean b21 = book3.isAvailable();
    boolean b22 = book3.isAvailable();
    java.lang.String str23 = book3.getAuthor();
    java.lang.String str24 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test499"); }

    Book book3 = new Book("", "hi!", "hi!");
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str8 = book3.getTitle();
    book3.setAvailable(false);
    java.lang.String str11 = book3.getAuthor();
    book3.setAvailable(true);
    book3.setAvailable(true);
    java.lang.String str16 = book3.getAuthor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test500"); }

    Book book0 = new Book();
    book0.setAvailable(false);
    book0.setAvailable(true);
    book0.setAvailable(true);
    java.lang.String str7 = book0.getAuthor();
    book0.setAvailable(true);
    boolean b10 = book0.isAvailable();
    book0.setAvailable(true);
    boolean b13 = book0.isAvailable();
    java.lang.String str14 = book0.getTitle();
    book0.setAvailable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

}
