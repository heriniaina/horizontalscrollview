I tried the "normal" way to center the views inside a horizontal scroll view, but it didn't work. So I use this approach.

Wait until the activity is ready, i.e. all views have their dimensions, then calculate the position of the "should be" centered item, then scroll to that item.

Everything is resumed in this code

```
int horizontalScrollViewWidth = findViewById(R.id.horizontal_scroll_view).getWidth();
int itemWidth = findViewById(R.id.button4).getWidth();
findViewById(R.id.horizontal_scroll_view).scrollBy(Math.round(findViewById(R.id.button4).getX()) - (horizontalScrollViewWidth/2) + (itemWidth/2),0);
```
