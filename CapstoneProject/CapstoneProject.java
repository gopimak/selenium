package CapstoneProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CapstoneProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/BAPS/eclipse-workspace/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//TC - 1: Login Test Case
		/*
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		*/
		
		//TC - 2: Login Failure with Invalid Credentials
		
		/*
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("standard_user");
		password.sendKeys("wrong_password");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);

		*/
		
		//TC - 3: Add a Product to the Cart
		/*
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		// Add backpack
		driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']//following::*[@id='add-to-cart-sauce-labs-backpack']")).click();
		// Add fleece jacket
		driver.findElement(By.xpath("//*[text()='Sauce Labs Fleece Jacket']//following::*[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
		*/
		
		//TC - 4: Remove item from cart- pre-req TC 3
		/*
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']//following::*[@id='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='remove-sauce-labs-backpack']")).click();
		*/
		
		
		//TC - 5: Checkout process
		/*
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']//following::*[@id='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Sauce Labs Onesie']//following::*[@id='add-to-cart-sauce-labs-onesie']")).click();
		driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("Gopi");
		driver.findElement(By.id("last-name")).sendKeys("Makwana");
		driver.findElement(By.id("postal-code")).sendKeys("L6Y 2R8");
		Thread.sleep(5000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("finish")).click();
		
		*/
		//TC - 6 Logout
		
		/*
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		*/
		
		//TC - 7 Verify Product Sorting (Price Low to high)
		
		/*
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//select[@class='product_sort_container']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//option[@value='lohi']")).click();
		*/
		
		//TC - 8 Verify Item details page
		
		/*
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		// Click on the first product's image or name to navigate to the product detail page
		driver.findElement(By.xpath("//div[@class='inventory_item']//img")).click();
		
		// Verify that the product details are correctly displayed
		String productName = driver.findElement(By.xpath("//*[@class='inventory_details_name large_size']")).getText();
        String productDescription = driver.findElement(By.xpath("//*[@class='inventory_details_desc large_size']")).getText();
        String productPrice = driver.findElement(By.xpath("//*[@class='inventory_details_price']")).getText();
        boolean isAddToCartButtonVisible = driver.findElement(By.id("add-to-cart")).isDisplayed();
        
        // Asserting that the product name, description, and price are displayed and correct
        assertTrue(productName.contains("Expected Product Name"), "Product name is incorrect");
        assertTrue(productDescription.length() > 0, "Product description is not displayed");
        assertTrue(productPrice.length() > 0, "Product price is not displayed");
        assertTrue(isAddToCartButtonVisible, "Add to Cart button is not visible");
        
        */
		//TC - 9 Cart Icon Updates When Items Are Added
		
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		String cartItemCount = "";
		
		// adding an item
		driver.findElement(By.xpath("//*[text()='Sauce Labs Onesie']//following::*[@id='add-to-cart-sauce-labs-onesie']")).click();
		try {
			cartItemCount = driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).getText();
            System.out.println("Cart item count displayed: " + cartItemCount);
		} catch (Exception e) {
            System.out.println("Cart icon did not update with item count.");
        }
		
		// Verify the cart icon is updated (without stopping test execution)
        if (!cartItemCount.equals("1")) {
            System.out.println("Verification failed: Cart icon does not display '1'. Actual: " + cartItemCount);
        } else {
            System.out.println("Verification passed: Cart icon displays '1' after adding an item.");
        }
		
		
		//TC - 10  Verify that a user can add multiple items to the cart and complete the checkout process
	
		/*
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		// Step 1: Add multiple products to the cart
		driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']//following::*[@id='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Sauce Labs Onesie']//following::*[@id='add-to-cart-sauce-labs-onesie']")).click();
		driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("Gopi");
		driver.findElement(By.id("last-name")).sendKeys("Makwana");
		driver.findElement(By.id("postal-code")).sendKeys("L6Y 2R8");
		Thread.sleep(5000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("finish")).click();
		
		String confirmationMessage = "";
        try {
            confirmationMessage = driver.findElement(By.className("complete-header")).getText();
            System.out.println("Order Confirmation: " + confirmationMessage);
        } catch (Exception e) {
            System.out.println("Order confirmation not displayed.");
        }

        // Verify that the order was successful
        if (!confirmationMessage.contains("Thank you for your order!")) {
            System.out.println("Verification failed: Order was not placed successfully.");
        } else {
            System.out.println("Verification passed: Order was placed successfully.");
        }
        */
		
		//TC - 11 Locked-Out User
		/*
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("locked_out_user");
		password.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		String errorMessage = "";
        try {
            errorMessage = driver.findElement(By.className("error-message-container")).getText();
            System.out.println("Error Message Displayed: " + errorMessage);
        } catch (Exception e) {
            System.out.println("Error message not displayed.");
        }

        // Check if the expected error message is displayed
        if (!errorMessage.contains("Sorry, this user has been locked out.")) {
            System.out.println("Verification failed: Expected error message not displayed.");
        } else {
            System.out.println("Verification passed: Correct error message displayed.");
        }
        */
        
		
		//TC - 12 Problem User
		/*
		
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		
		WebElement productImage = driver.findElement(By.xpath("//img[@class='inventory_item_img']"));
		if (productImage.isDisplayed()) {
            String imageSource = productImage.getAttribute("src");
            Thread.sleep(2000);
            if (imageSource == null || imageSource.isEmpty()) {
                System.out.println("UI Bug detected: Product image is not loading.");
            } else {
                System.out.println("No UI Bug: Product image is loading correctly.");
            }
        } else {
            System.out.println("UI Bug detected: Product image is not displayed.");
        }
        */
	}

	private static void assertTrue(boolean contains, String string) {
		// TODO Auto-generated method stub
		
	}
}
