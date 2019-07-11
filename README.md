# TastyToasty
An easy-to-use library to create tasty  😋 Toasts with a bunch of flavours 🌈 It also provides effortless methods to create Instagram like Toasts 💓

# Usage
 
## Instagram Toasts


1. Instagram Like 
<br>
<div align="center">
<img src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/Instagram/like.JPG"/>
</div>

``` java 
TastyToasty.instaLike(MainActivity.this, "1").show();
```
<br>
<br>

<b>Similarly ```2. instaFollower``` and ```3. instaComment``` can be used</b> <br><br>
<div align="center">
<img hspace="20" height="150" width="360" src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/Instagram/follower.JPG"/><img height="140" width="360" src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/Instagram/comment.JPG"/>
</div>
<br><br>


4. Instagram All
<br>
<div align="center">
<img height="110" width="300" src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/Instagram/InstaAll.JPG"/>
</div>

``` java 
TastyToasty.instaAll(MainActivity.this, "101","20","60").show();
```
<br>
<br>

</ol>


## VIBGYOR Toasts 🌈

<ol>
<li>VIOLET</li>
<br>
<div align="center">
<img height="95" width="300" src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/vibgyor/violet.JPG"/>
</div>
</ol>

``` java 
TastyToasty.violet(MainActivity.this, "Its lit", R.drawable.ic_whatshot).show();
```
<br>

<b>Similarly the rest of <i>VIBGYOR</i> can be used</b> <br><br>

<img height="95" width="290" src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/vibgyor/indigo.JPG"/><img height="95" width="290" src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/vibgyor/blue.JPG"/>
<img height="95" width="290" src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/vibgyor/Green.JPG"/>
<img height="95" width="290" src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/vibgyor/yellow.JPG"/>
<img height="95" width="290" src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/vibgyor/orange.JPG"/>
<img height="95" width="290" src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/vibgyor/red.JPG"/>

<h3> You can pass null for those arguments which you don't want in your Toast (eg Toast w/o icon or w/o Text). We've handled it for you 🤗 </h3>
<br><br>

## Standard Toasts
1. Success
<br>

<div align="center">
<img height="95" width="300" src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/standard/success.JPG"/>
</div>

``` java 
TastyToasty.success(MainActivity.this, "Task Successful").show();
```

<br>
<b>Similarly the rest of <i>standard</i> (error, trending, star) can be used</b> <br><br>

<img height="95" width="290" src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/standard/error.JPG"/><img height="95" width="290" src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/standard/trending.JPG"/>
<img height="95" width="290" src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/standard/star.JPG"/>

<br>
<br>


## Custom Toasts

<b> 1. using </b>  ``` makeText()``` 

<div align="center">
<img src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/Custom/custom.JPG" />
</div>
<br><br>

``` java
// Pass the last attribute as false or null if your do not want the tail in Toast
TastyToasty.makeText(MainActivity.this, "This is a custom toast",TastyToasty.LONG, R.drawable.ic_action_favourite, R.color.violet, R.color.white, true).show();
```		


<b> 2. Builder Method </b> (More easier to use)
<br><br>

<div align="center">
<img src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/Custom/builder.JPG" />
</div>



``` java
new TastyToasty.Builder(MainActivity.this)
  .setText("This one is using builder method")    
  .setBackgroundColor(R.color.green)      
  .setIconId(R.drawable.ic_verified_user)
  .showTail(true) // Pass false or null or don't call at all if you don't want the "tail" in your toast
  .show();
```

<br><br>

<h4> Using builder method you can create customized Toasts pretty easily. Only call the methods for attributes which you would like to have in your Toast. 
For example, if you want a  Toast  with just icon, just call that method (make sure you always pass the context though) and ignore the rest of the attribute setting methods. Below is an example of the same. </h4>

<br><br>


``` java
//Default text color is white and default background color is pinkinsh red
new TastyToasty.Builder(MainActivity.this)
    .setIconId(R.drawable.ic_whatshot)
    .show();
```		


<div align="center">
<img src="https://github.com/usman18/TastyToasty/blob/master/Screenshots/Custom/trending_custom.JPG" />
</div>








