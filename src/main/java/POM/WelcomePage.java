package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage(WebDriver driver) { //here WelcomePage is a constructor
		PageFactory.initElements(driver,this);//In POM we declare the element by using @FindBy annoation and we initialize the element by using PageFactory.initElements() method
											  //PageFactory.initElements() method will take 2 arguments
											  //1.WebDriver(driver) & 2.Object of the POM class or page class(this)|
		
	}
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;
	
	@FindBy(linkText = "Log in")
	private WebElement LoginLink;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement ShoppingcartLink;
	
	@FindBy(linkText = "Wishlist")
	private WebElement WishlisttLink;
	
	@FindBy(partialLinkText = "Books")
	private WebElement BooksLink;
	
	@FindBy(partialLinkText = "Computers")
    private WebElement ComputersLink;
	
	@FindBy(partialLinkText = "Electronics")
    private WebElement ElectronicsLink;
	
	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement ApparelShoesLink;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement DigitalDownloadsLink;
	
	@FindBy(partialLinkText = "Jewelry")
	private WebElement JewelryLink;
	
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement GiftCardsLink;
	
	@FindBy(partialLinkText = "Desktops")
	private WebElement DesktopsLink;
	

	public WebElement getDesktopsLink() {
		return DesktopsLink;
	}


	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	
	public WebElement getLoginLink() {
		return LoginLink;
	}



	public WebElement getShoppingcartLink() {
		return ShoppingcartLink;
	}

	
	public WebElement getWishlisttLink() {
		return WishlisttLink;
	}

	

	public WebElement getBooksLink() {
		return BooksLink;
	}



	public WebElement getComputersLink() {
		return ComputersLink;
	}

	

	public WebElement getElectronicsLink() {
		return ElectronicsLink;
	}

	

	public WebElement getApparelShoesLink() {
		return ApparelShoesLink;
	}

	

	public WebElement getDigitalDownloadsLink() {
		return DigitalDownloadsLink;
	}

	

	public WebElement getJewelryLink() {
		return JewelryLink;
	}

	

	public WebElement getGiftCardsLink() {
		return GiftCardsLink;
	}

	
}




