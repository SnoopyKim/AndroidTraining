# AndroidTraining

Study for Android fundamentals - https://codelabs.developers.google.com/android-training/

<h3>AndroidTraining1</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-text-and-scrolling-views/img/604a6e36cc43048d.png">
<pre>
01.1 -> Install the Android Studio development environment.
	Create an emulator (virtual device) to run your app on your computer.
        Create and run the Hello World app on the virtual and physical devices.
        Explore the project layout.
        Generate and view log messages from your app.
        Explore the AndroidManifest.xml file.
</pre>
<pre>
01.2 -> Create an app and add two Button elements and a TextView to the layout.
	Manipulate each element in the ConstraintLayout to constrain them to the margins and other elements.
	Change UI element attributes.
	Edit the app's layout in XML.
	Extract hardcoded strings into string resources.
	Implement click-handler methods to display messages on the screen when the user taps each Button.
</pre>
<pre>
01.3 -> Create a layout variant for a horizontal display orientation.
	Create a layout variant for tablets and larger displays.
	Modify the layout to add constraints to the UI elements.
	Use ConstraintLayout baseline constraints to align elements with text.
	Use ConstraintLayout pack and align buttons to align elements.
	Change the layout to use LinearLayout.
	Position elements in a LinearLayout.
	Change the layout to use RelativeLayout.
	Rearrange the views in the main layout to be relative to each other.
</pre>
<pre>
01.4 -> Explore some of the many resources available to Android developers of all levels.
	Add a launcher icon for your app.
</pre>
<pre>
04.3 -> Coding challenge: add a context menu that appears when the user performs a touch & hold on the TextView.
</pre>

<h3>TwoActivities</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-create-an-activity/img/72c5f62669fa22af.png">
<pre>
02.1 -> Create a new Android app with a main Activity and a second Activity.
	Pass some data (a string) from the main Activity to the second using an Intent, and display that data in the second Activity.
	Send a second different bit of data back to the main Activity, also using an Intent.
</pre>
<pre>
02.2 -> Add code to the TwoActivities app from the previous practical to implement the various Activity lifecycle callbacks to include logging statements.
	Observe the state changes as your app runs and as you interact with each Activity in your app.
	Modify your app to retain the instance state of an Activity that is unexpectedly recreated in response to user behavior or configuration change on the device.
</pre>

<h3>ImplicitIntents</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-activity-with-implicit-intent/img/75924fd32283279b.png">
<pre>
02.3 -> Create a new app to experiment with implicit Intent.
	Implement an implicit Intent that opens a web page, and another that opens a location on a map.
	Implement an action to share a snippet of text.
	Create a new app that can accept an implicit Intent for opening a web page.
+ Homework -> 	Add another button at the bottom of the screen.
		When the Button is clicked, launch a camera app to take a picture. (Don't need to return the picture to the original app.)
</pre>

<h3>SimpleCalc</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-using-debugger/img/26a2273d0165e2cb.png">
<pre>
03.1 -> Set and view breakpoints in the code for SimpleCalc.
	Step through your code as it runs.
	Examine variables and evaluate expressions.
	Identify and fix problems in the sample app.
</pre>
<pre>
03.2 -> Run the initial tests in the SimpleCalc app.
	Add more tests to the SimpleCalc app.
	Run the unit tests to see the results.
</pre>

<h3>HelloCompat</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-support-libraries/img/240252e5b01d106f.png">
<pre>
03.3 -> Create a new app with one TextView and one Button.
	Verify that the Android Support Repository (containing the Android Support Library) is available in your Android Studio installation.
	Explore the build.gradle files for your app project.
	Manage class or method calls that are unavailable for the version of Android your app supports.
	Use a compatibility class from the support library to provide backward-compatibility for your app.
</pre>

<h3>DroidCafe</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-clickable-images/img/5961de998cd2e4cf.png">
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-input-controls/img/c97b83b2b1641618.png">
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-menus-and-pickers/img/da72bfc83aae5644.png">
<pre>
04.1 -> Create a new Android Studio project for a mock dessert-ordering app that uses images as interactive elements.
	Set onClick() handlers for the images to display different Toast messages.
	Change the floating action button supplied by the template so that it shows a different icon and launches another Activity.
+ Homework -> Create a layout variant for horizontal orientation: content_main.xml (land).
</pre>
<pre>
04.2 -> Show a keyboard for entering an email address.
		Show a numeric keypad for entering phone numbers.
		Allow multiple-line text entry with automatic sentence capitalization.
		Add radio buttons for selecting an option.
		Set an onClick handler for the radio buttons.
		Add a spinner for the phone number field for selecting one value from a set of values.
</pre>
<pre>
04.3 -> Continue adding features to the Droid Cafe project from the previous practical.
		Add menu items to the options menu.
		Add icons for menu items to appear in the app bar.
		Connect menu-item clicks to event handlers that process the click events.
+Homework -> Add a Date button under the delivery options that shows the date picker.
</pre>
<pre>
04.4 -> Continue adding features to the Droid Cafe project from the previous practical.
		Provide the Up button in the app bar to navigate up to the parent Activity.
</pre>

<h3>Dialog For Alert</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-menus-and-pickers/img/6fcbad5be57491f3.png">
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-menus-and-pickers/img/acfbdf73053e33ee.png">
<pre>
04.3 -> Use an alert dialog to request a user's choice.
		Use a date picker for date input.
</pre>

<h3>Tab Experiment</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-provide-user-navigation/img/213f9d59283810bb.png">
<pre>
04.4 -> Create a new app with tabs for navigating Activity screens that can also be swiped.
</pre>

<h3>RecyclerView</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-create-recycler-view/img/86fabc5476249934.png" />
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-create-recycler-view/img/95ab0af3b6e24d7b.png" />
<pre>
04.5 -> Create a new app that uses a RecyclerView to display a list of items as a scrollable list and associate click behavior with the list items.
		Use a FAB to let the user add items to the RecyclerView.
+Homework -> Create an app that uses a RecyclerView to display a list of recipes.
			 Each list item must show the name of the recipe with a short description.
			 When the user taps a recipe (an item in the list), start an Activity that shows the full recipe text.
			 Clicking the Up button takes the user back to the list of recipes.
</pre>