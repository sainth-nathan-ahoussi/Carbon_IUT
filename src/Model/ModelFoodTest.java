package Model;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Model.ModelFood;

import static org.junit.Assert.*;

public class ModelFoodTest {
   private ModelFood modelfood;

   @BeforeClass
   public static void setUpBeforeClass() throws Exception {
      ModelFood modelfood = new ModelFood(0, 0, 0, 0);
   }

   @Test
   public void testInit() {
      modelfood.setNbVegan(3);
      modelfood.setNbVegetarien(2);
      modelfood.setNbBoeuf(1);
      modelfood.setNbAutreViandePoisson(5);

      modelfood.init();
      assertEquals(0, modelfood.getnbVegan());
      assertEquals(0, modelfood.getnbVegetarien());
      assertEquals(0, modelfood.getnbBoeuf());
      assertEquals(0, modelfood.getnbAutreViandePoisson());
   }



   @Test
   public void testConstructeur() {
      ModelFood localModelFood = new ModelFood(2, 4, 6, 8);
      assertEquals(2, localModelFood.getnbVegan());
      assertEquals(4, localModelFood.getnbVegetarien());
      assertEquals(6, localModelFood.getnbBoeuf());
      assertEquals(8, localModelFood.getnbAutreViandePoisson());
   }

   @Test
   public void testSetNbVegan() {
      modelfood.setNbVegan(5);
      assertEquals(5, modelfood.getnbVegan());
   }

   @Test
   public void testSetNbVegetarien() {
      modelfood.setNbVegetarien(3);
      assertEquals(3, modelfood.getnbVegetarien());
   }

   @Test
   public void testSetNbBoeuf() {
      modelfood.setNbBoeuf(8);
      assertEquals(8, modelfood.getnbBoeuf());
   }

   @Test
   public void testSetNbAutreViandePoisson() {
      modelfood.setNbAutreViandePoisson(10);
      assertEquals(10, modelfood.getnbAutreViandePoisson());
   }


   @Test
   public void testaddMealsAndcomputeCO2() {
      modelfood.addMeals(ModelFood.Meal.VEGAN, 2);
      modelfood.addMeals(ModelFood.Meal.VEGETARIEN, 3);
      modelfood.addMeals(ModelFood.Meal.BOEUF, 1);
      modelfood.addMeals(ModelFood.Meal.AUTRE_VIANDE_POISSON, 4);

      assertEquals(0.8, modelfood.computeCO2(ModelFood.Meal.VEGAN), 0.001);
      assertEquals(1.5, modelfood.computeCO2(ModelFood.Meal.VEGETARIEN), 0.001);
      assertEquals(7.0, modelfood.computeCO2(ModelFood.Meal.BOEUF), 0.001);
      assertEquals(4.4, modelfood.computeCO2(ModelFood.Meal.AUTRE_VIANDE_POISSON), 0.001);
   }



}
