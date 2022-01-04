package core;

import com.google.inject.Inject;
import pages.CartPage;
import pages.MainPage;
import pages.ProductDetailsPage;

public class Pages {
    @Inject
    public MainPage mainPage;

    @Inject
    public CartPage cartPage;

    @Inject
    public ProductDetailsPage productDetailsPage;
}
