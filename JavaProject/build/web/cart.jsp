<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Products</title>

        <!--link to css-->
        <link rel="stylesheet" href="css/style_1.css">

        <!--box icons-->
        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    </head>
    <body>
        <!--Header-->
        <header>
            <!--Nav-->
            <div class="nav container">
                <a href="index.jsp" class="logo">Gimasha Service Center</a>
                <!--cart-icon-->
                <i class='bx bx-shopping-bag'id="cart-icon"></i>
            </div>

            <!--cart-->
            <div class="cart">
                <h2 class="cart-title">Your cart</h2>

                <!--content-->
                <div class="cart-content">

                </div>

                <!--total-->
                <div class="total">
                    <div class="total-title">Total</div>
                    <div class="total-price">Rs.0</div>
                </div>

                <!--buy button-->
                <button type="button" class="btn-buy">Buy Now</button>

                <!--cart close-->
                <i class='bx bx-x' id="close-cart"></i>

            </div>
        </header>
        

        <!--shop-->
        <section class="shop container">
            <h2 class="section-title">Cleaning Products</h2>

            <!--content-->
            <div class="shop-content">
                <!--box 1-->
                <div class="product-box">
                    <img src="img/Cleaning Products/product1.jpg" alt="" class="product-img">
                    <h2 class="product-title">Meguiar's Quik Interior Detailer</h2>
                    <span class="price">Rs.3861.08</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 2-->
                <div class="product-box">
                    <img src="img/Cleaning Products/product2.jpg" alt="" class="product-img">
                    <h2 class="product-title">Chemical Guys Total Interior Cleaner & Protectant</h2>
                    <span class="price">Rs.3564.01</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 3-->
                <div class="product-box">
                    <img src="img/Cleaning Products/product3.jpg" alt="" class="product-img">
                    <h2 class="product-title">KevianClean Interior Defense Car Vinyl Protectant DashboardÂ Cleaner</h2>
                    <span class="price">Rs.7720.07</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 4-->
                <div class="product-box">
                    <img src="img/Cleaning Products/product4.jpg" alt="" class="product-img">
                    <h2 class="product-title">3M Glass Cleaner</h2>
                    <span class="price">Rs.5345.03</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 5-->
                <div class="product-box">
                    <img src="img/Cleaning Products/product5.jpg" alt="" class="product-img">
                    <h2 class="product-title">Meguiar's Perfect Clarity Glass Cleaner</h2>
                    <span class="price">Rs.3500.07</Rs></span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 6-->
                <div class="product-box">
                    <img src="img/Cleaning Products/product6.jpg" alt="" class="product-img">
                    <h2 class="product-title">Armor All Car Wash Soap, Foaming Car Wash</h2>
                    <span class="price">Rs.2440.05</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 7-->
                <div class="product-box">
                    <img src="img/Cleaning Products/product7.jpg" alt="" class="product-img">
                    <h2 class="product-title">Qlincare car wash liquid soap</h2>
                    <span class="price">Rs.2100.08</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 8-->
                <div class="product-box">
                    <img src="img/Cleaning Products/product8.jpg" alt="" class="product-img">
                    <h2 class="product-title">CRelentless Drive Car Detailing KitÂ -18pc</h2>
                    <span class="price">Rs.24845.99</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>
            </div>
        </section>
        <section class="shop container">
            <h2 class="section-title">Filter Products</h2>

            <!--content-->
            <div class="shop-content">

                <!--box 1-->
                <div class="product-box">
                    <img src="img/Filter Products/product1.jpg" alt="" class="product-img">
                    <h2 class="product-title">Oil Filter Bosch 72161WS</h2>
                    <span class="price">Rs.2320.64</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 2-->
                <div class="product-box">
                    <img src="img/Filter Products/product2.jpg" alt="" class="product-img">
                    <h2 class="product-title">Mopar 5281090 Oil Filter Engine</h2>
                    <span class="price">Rs.4141.04</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 3-->
                <div class="product-box">
                    <img src="img/Filter Products/product3.jpg" alt="" class="product-img">
                    <h2 class="product-title">PRORAM Induction Performance Universal Cone Air Filter Intake 120mm - 76mm ID</h2>
                    <span class="price">Rs.12648.08</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 4-->
                <div class="product-box">
                    <img src="img/Filter Products/product4.jpg" alt="" class="product-img">
                    <h2 class="product-title">Ramair Performance Universal Induction Intake Foam Air Filter Custom- 76mm ID</h2>
                    <span class="price">Rs.7115.84</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 5-->
                <div class="product-box">
                    <img src="img/Filter Products/product5.jpg" alt="" class="product-img">
                    <h2 class="product-title">Ramair Panel Air Filter for VW Golf mk7 R GTI GTD Cupra 280 ST FR S3 2.0tsi tdi</h2>
                    <span class="price">Rs.4141.04</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 6-->
                <div class="product-box">
                    <img src="img/Filter Products/product6.jpg" alt="" class="product-img">
                    <h2 class="product-title"> Universal 1/4" 5/16" 3/8" Chrome Glass Reusable Washable Inline Fuel Filter</h2>
                    <span class="price">Rs.3401.04</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 7-->
                <div class="product-box">
                    <img src="img/Filter Products/product7.jpg" alt="" class="product-img">
                    <h2 class="product-title">FUEL FILTERS INDUSTRIAL HIGH PERFORMANCE INLINE GAS FUEL LINE UNIVERSAL</h2>
                    <span class="price">Rs.14800.55</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 8-->
                <div class="product-box">
                    <img src="img/Filter Products/product8.jpg" alt="" class="product-img">
                    <h2 class="product-title">Micron Fuel Filter Inline 6AN 8AN Universal High Flow Billet Aluminium Black</h2>
                    <span class="price">Rs.7992.69</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>
            </div>     
        </section>
        <section class="shop container">
            <h2 class="section-title">Oil Products</h2>

            <!--content-->
            <div class="shop-content">

                <!--box 1-->
                <div class="product-box">
                    <img src="img/Oil Products/product1.jpg" alt="" class="product-img">
                    <h2 class="product-title">Rislone Engine Oil Stop Leak Repair Concentrate</h2>
                    <span class="price">Rs.5473.04</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 2-->
                <div class="product-box">
                    <img src="img/Oil Products/product2.jpg" alt="" class="product-img">
                    <h2 class="product-title">Liqui Moly MoS2 Leichtlauf 10W-40 Engine Oil Made in Germany 2184 1 L</h2>
                    <span class="price">Rs.5106.09</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 3-->
                <div class="product-box">
                    <img src="img/Oil Products/product3.jpg" alt="" class="product-img">
                    <h2 class="product-title">PENRITE RACING 10 PERFORMANCE ENGINE OIL (10W-40) FULL SYNTHETIC 5 LITRE</h2>
                    <span class="price">Rs.19220.55</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 4-->
                <div class="product-box">
                    <img src="img/Oil Products/product4.jpg" alt="" class="product-img">
                    <h2 class="product-title">CC-1590 COMP Cams 1 Quart of 10W-30 Break-In Engine Oil</h2>
                    <span class="price">Rs.17123.60</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 5-->
                <div class="product-box">
                    <img src="img/Oil Products/product5.jpg" alt="" class="product-img">
                    <h2 class="product-title">Driven Racing Oil Motor Oil GP-1 Break-In 30W Semi-Synthetic 1</h2>
                    <span class="price">Rs.10072.88</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 6-->
                <div class="product-box">
                    <img src="img/Oil Products/product6.jpg" alt="" class="product-img">
                    <h2 class="product-title">Red Line Engine Oil Break-in Additive ZDDP Running in Start up Anti-wear 16oz</h2>
                    <span class="price">Rs.7841.04</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 7-->
                <div class="product-box">
                    <img src="img/Oil Products/product7.jpg" alt="" class="product-img">
                    <h2 class="product-title">Comp Cams Motor Oil Break-In High Zinc 10W30 Conventional 1 Qt</h2>
                    <span class="price">Rs.4700.48</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>

                <!--box 8-->
                <div class="product-box">
                    <img src="img/Oil Products/product8.jpg" alt="" class="product-img">
                    <h2 class="product-title">Valvoline 799222 Power Steering Fluid -Â 1Â Gallon</h2>
                    <span class="price">Rs.11271.68</span>
                    <i class='bx bx-shopping-bag add-cart'></i>
                </div>
            </div>
        </section>
        <!--link to js-->
        <script src="js/main.js"></script>
    </body>
</html>
