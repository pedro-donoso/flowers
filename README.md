1. agrego card:

```
implementation("androidx.cardview:cardview:1.0.0")
```

2. agrego viewbinding:

```
buildFeatures {
        compose = true
        viewBinding = true
}

dataBinding {
        enable = true
}
```

3. actualizo themes:

```
   <?xml version="1.0" encoding="utf-8"?>
<resources>

    <style name="AppTheme" parent="Theme.MaterialComponents.Light.NoActionBar" />
</resources>
```

//
   
 
 
