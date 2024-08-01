# Dog Nutrition Food Ordering App

This is a simple Android application for ordering dog food. Users can register, log in, view a list of available dog food items, add items to their cart, update quantities, and checkout. The application uses arrays for data storage instead of a database.

## Features

- User Registration and Login
- Home Screen with Welcome Message and Featured Items
- Items Screen with List of Dog Food Products
- Cart Screen with Quantity Update and Checkout Functionality
- Bottom Navigation for Easy Navigation between Home, Items, and Cart

## Folder Structure

```
FoodOrderApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/tharindux/foodorderapp/
│   │   │   │       ├── MainActivity.java
│   │   │   │       ├── models/
│   │   │   │       │   └── FoodItem.java
|   |   |   |       |   └── User.java
|   |   |   |       |   └── Cart.java
│   │   │   │       ├── ui/
│   │   │   │       │   ├── CartFragment.java
│   │   │   │       │   ├── HomeFragment.java
│   │   │   │       │   └── ItemsFragment.java
│   │   │   │       ├── adapters/
│   │   │   │       │   ├── CartAdapter.java
│   │   │   │       │   ├── FeaturedAdapter.java
│   │   │   │       │   └── ItemsAdapter.java
│   │   │   │       └── activities/
│   │   │   │           ├── LoginActivity.java
│   │   │   │           └── RegisterActivity.java
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_login.xml
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   ├── activity_register.xml
│   │   │   │   │   ├── fragment_cart.xml
│   │   │   │   │   ├── fragment_home.xml
│   │   │   │   │   ├── fragment_items.xml
│   │   │   │   │   ├── item_featured.xml
│   │   │   │   │   ├── item_food.xml
│   │   │   │   │   └── item_cart.xml
│   │   │   │   ├── menu/
│   │   │   │   │   └── bottom_navigation_menu.xml
│   │   │   │   ├── color/
│   │   │   │   │   └── nav_item_color.xml
│   │   │   │   ├── navigation/
│   │   │   │   │   └── mobile_navigation.xml
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   ├── strings.xml
│   │   │   │   │   ├── styles.xml
│   │   │   │   │   └── themes.xml
│   │   │   │   └── drawable/
│   │   │   │       ├── ic_home.xml
│   │   │   │       ├── ic_items.xml
│   │   │   │       └── ic_cart.xml
│   │   │   └── AndroidManifest.xml
│   └── build.gradle
└── gradle/
```

## Getting Started

### Prerequisites

- Android Studio
- Java Development Kit (JDK) 8 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/TharinduWijayarathna/DogNutritionApp.git
   ```
2. Open the project in Android Studio.

3. Build and run the project on an emulator or a physical device.

## Usage

1. **Register**: Create a new account by providing your name, email, and password.
2. **Login**: Log in with your registered email and password.
3. **Home Screen**: View a welcome message, a banner, and featured items.
4. **Items Screen**: Browse the list of dog food products and add them to your cart.
5. **Cart Screen**: View items in your cart, update quantities, and proceed to checkout.

## Customization

- **Adding New Items**: Modify the `populateFoodItems()` method in `ItemsFragment.java` to add new dog food products.
- **UI Customization**: Update the XML layout files in `res/layout` and the styles in `res/values/styles.xml`.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -am 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

If you have any questions or feedback, please contact me at [wikum.dev@gmail.com](mailto:wikum.dev@gmail.com).

