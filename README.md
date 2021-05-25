# Recyclerview Animations

An example of how to create animations for recycler views items.

## Creating the animation

First we have to create an animation file resource to be executed when the items are displayed. In our case will be a motion on the Y axis and a fade in:

```xml
<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android">

    <!-- There will be a alpha effect from 0% to 100% with a 400 milliseconds duration -->
    <alpha
        android:duration="400"
        android:fromAlpha="0"
        android:toAlpha="1" />

    <!-- There will be a slide effect on the y axis from -200% to 0%
        This means it will slide from the top to the bottom with a 400 milliseconds duration -->
    <translate
        android:duration="400"
        android:fromYDelta="-200%"
        android:toYDelta="0%" />

</set>
```

### Setting up the animation into the recyclerview

All we have to do is to set the android:layoutAnimation property with our animation resources:

```xml
<androidx.recyclerview.widget.RecyclerView
    android:id="@+id/rvColors"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layoutAnimation="@anim/slide_in_animation"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintLeft_toLeftOf="parent"
    app:layout_constraintRight_toRightOf="parent"
    app:layout_constraintTop_toTopOf="parent" />
```
