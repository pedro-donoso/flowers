![scroll](https://github.com/user-attachments/assets/3ca2fe52-bdb4-40a5-a427-f00da27e30aa)

1. agrego card:

´´´
implementation("androidx.cardview:cardview:1.0.0")
´´´

2. agrego viewbinding:

´´´
buildFeatures {
        compose = true
        viewBinding = true
}

dataBinding {
        enable = true
}
´´´

3. actualizo themes:

´´´
   <?xml version="1.0" encoding="utf-8"?>
<resources>

    <style name="AppTheme" parent="Theme.MaterialComponents.Light.NoActionBar" />
</resources>
´´´
