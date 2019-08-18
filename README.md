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
<pre>
06.1 -> Set up Espresso in project.
	Test for Activity switching and text input.
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

<h3>DroidCafe & WithSettings</h3>
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
<pre>
09.2 -> Add Settings Activity with PreferenceActivity
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
+Homework ->	Create an app that uses a RecyclerView to display a list of recipes.
		Each list item must show the name of the recipe with a short description.
		When the user taps a recipe (an item in the list), start an Activity that shows the full recipe text.
		Clicking the Up button takes the user back to the list of recipes.
</pre>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-adaptive-layouts/img/a2294efedb7e2ff2.png" />
<pre>
05.3 -> Homework: Modify the RecyclerView app to use a GridLayoutManager with the following column counts:
		1 column in portrait orientation, 2 columns in landscape orientation
</pre>

<h3>Scorekeeper</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-drawables-styles-and-themes/img/6ff1e098bf0726f4.png" />
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-espresso-for-ui-testing/img/e17e45f64d1220a9.png" />
<pre>
05.1 -> Create a new app and add Button and TextView elements to the layout.
	Create Drawable resources in XML and use them as backgrounds for your Button elements.
	Apply styles to UI elements.
	Add a menu item that changes the theme of the app to a low contrast "night mode."
	Coding challenge: create a Drawable resource that changes the background of the ImageButton to the same color as the border when the state of the ImageButton is "pressed". You should also set the color of the text inside the ImageButton elements to a selector that makes it white when the button is "pressed".
</pre>
<pre>
06.1 -> Reord multiple interactions with the UI.
	Edit the tests to perform actions.
	Using the recorded code as a snippet to copy, paste, and edit.
</pre>

<h3>MaterialMe-Starter</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-cards-and-colors/img/1e3ffbf95cd3384c.png" />
<pre>
05.2 -> Modify an app to follow Material Design guidelines.
	Add images and styling to a RecyclerView list.
	Implement an ItemTouchHelper to add drag-and-drop functionality to your app.
	Coding challenge: Implement a way to ensure that the state of the app is persistent across orientation changes.
+Homework -> Create a shared element transition between the MainActivity and the DetailActivity, with the banner image for the sport as the shared element.
	Clicking on a list item in the MaterialMe app triggers the transition. The banner image from the card moves to the top of the screen in the detail view.
</pre>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-adaptive-layouts/img/5c00592ae7e375be.png" />
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-adaptive-layouts/img/c6afa0d002d0098a.png" />
<pre>
05.3 -> Update the MaterialMe app for better use of space in landscape mode.
	Add an alternative layout for tablets.
	Localize the content of your app.
	Coding challenge: Use the localization techniques to translate all of the strings in your app into a different language. (I used korean)
</pre>

<h3>SimpleAsyncTask</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-create-asynctask/img/ac2145d527ad4625.png" />
<pre>
07.1 -> Create a simple app that executes a background task using an AsyncTask.
	Run the app and see what happens when you rotate the device.
	Implement activity instance state to retain the state of a TextView message.
</pre>

<h3>WhoWroteIt && WhoWroteItLoader</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-asynctask-asynctaskloader/img/e29db06b7c9abd7d.png" />
<pre>
07.2 -> Use the Google APIs Explorer to learn about the Books API.
	Create the "Who Wrote It?" app, which queries the Books API using a worker thread and displays the result in the UI.
	Modify the "Who Wrote It?" app to use an AsyncTaskLoader instead of an AsyncTask.
</pre>

<h3>PowerReceiver</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-broadcast-receivers/img/26c4a5117e27b023.png" />
<pre>
07.3 -> Subclass a BroadcastReceiver to show a toast when a broadcast is received.
	Register your receiver to listen for system broadcasts.
	Send and receive a custom broadcast intent.
</pre>

<h3>Notify Me!</h3>
<img height="400" float="left" src="https://codelabs.developers.google.com/codelabs/android-training-notifications/img/a63581bd545c65d2.png" />
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-notifications/img/18372f91a1eb5837.png" />
<pre>
08.1 -> Create an app that sends a notification when the user taps a button in the app.
	Update the notification from a button in your app, and from an action button that's inside the notification.
</pre>

<h3>Stand Up!</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-alarm-manager/img/c01bab932820b1d9.png" />
<pre>
08.2 -> Set a repeating alarm to notify you every 15 minutes.
	Use a ToggleButton to set and keep track of the alarm.
	Use Toast messages to notify the user when the alarm is turned on or off.
</pre>

<h3>NotificationJobService</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-job-scheduler/img/cd843e845163afa3.png" />
<pre>
08.3 -> Implement a JobService that delivers a simple notification to let the user know the job is running.
	Get user Input to configure constraints (such as waiting until the device is charging) on the JobService.
	Schedule the job using JobScheduler.
</pre>

<h3>Hello Shared Prefs</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-shared-preferences/img/5dfd63922ee74727.png" />
<pre>
09.1 -> Update an app so it can save, retrieve, and reset shared preferences.
</pre>

<h3>App with Settings</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-adding-settings-to-app/img/b0ee2c02cb4db655.png" />
<pre>
09.2 -> Add a Setting option toggle switch.
	Add code to set the default value for the setting, and access the setting value after it has changed.
	Use and customize the Android Studio Settings Activity template.
</pre>

<h3>Room Words Sample</h3>
<img height="400" src="https://codelabs.developers.google.com/codelabs/android-training-livedata-viewmodel/img/abf24350514167bf.png" />
<pre>
10.1 -> Create Entity that represents word objects.
	Define the mapping of SQL queries to Java methods in a DAO(data access object).
	Use LiveData to make changes to the data visible to the UI, by way of observers.
	Add a Room database to the app for persisting data locally, and initialize the database.
	Abstract the data backend as a Repository class with an API that is agnostic to how the data is stored or acquired.
	Use a ViewModel to seperate all data operations from the UI.
</pre>