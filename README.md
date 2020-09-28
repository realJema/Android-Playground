# Android-Playground

## Application Framework
- Activity Manager
Controls all aspects of teh application lifecycle and activity stack
- Content Providers
Allows applications to publish and share data with other applications
- Resource Manager
Provides access to non-code embedded resources such as strings color settings and user interface layouts
- Notifications Manager
Allows application s to display alerts and notifications to the user
- View System
An extensible set of views used to create application s user interfaces

#### Activities
Activity performs actions on the screen, it represents a single screen with a user interface.
```
public class MainActivity extends Activity {
}
```
#### Services
Component that runs on the background to perform long-running operations
```
public class MyService extends Service {
}
```
#### Broadcast Receivers
Respond to broadcast messages from other applications or from the system
```
public class MyReceiver extends BroadcastReceiver {
    public void onReceive(context,intent){}
}
```
#### Content Providers
Supplies data from one application to others on request
```
public class MyContentProvider extends ContentProvider {
    public void onCreate(){}
}
```
#### Additional Components
- Fragments
Represent a portion of user interface in an Activity
- Views
UI elements that are drawn on-screen including buttons, lists, forms etc
- Layouts
View hierachies that control screen format and appearance of the views
- Intents
Messages wiring components together
- Resources
External elements such as strings, sonstants and drawable pictures
- Manifest
Configuration file for the application










































<details>
<summary>Android Head First Book</summary>
<br>
My android learning plaground
author: @realjema
date: july-2020

### Apps
#### Beginner
##### Layouts
- Intents
- Layouts
- Send & Receive Messages
- spinner buttons
- Stop watch

## Notes
# Android Development 

Learning how to build android apps 2020

**spinner**: Android term for a drop-down list of values 
#### Syntax: Array 
```
    <string-array name="string_array_name">
        <item>string_value1</item>
        <item>string_value2</item>
        <item>string_value3</item>
        ...
    </string-array>
```

## Intents
An intent is a type of message that allows you to bind separate objects together at runtime. 

passing values through intents
`
intent.putExtra("message", value);
`
receiving values from intents 
`
String string = intent.getStringExtra("message");
`

- intents support are declared in the manifest file 
- You can start an activity in another application by passing an intent with `startActivity()`


## Activities 
Handlers allow you to schedule code. A handler is an android class you can use to schedule code that should be run on a different thread. 
```
final Handler handler = new Handler();
handler.post(Runnable_code);
```

postDelayed() - Delay running the code by a specified number of milliseconds

`handler.postDelayed(Runnable_code, long)`

#### Lifecycle of Activities 
Activity Launched 
- OnCreate()
- OnStart() < ------------------,
- onResume()                    |
Activity Running           onRestart()
- onPause()                     |
- onStop() / -------------------`
- onDestroy()
Activity destroyed


1. onCreate()
When the activity is first created. Bundle giving the previously saved state of the activity

2. onRestart()
When the activity has been stopped just before it gets started again

3. onStart()
When the activity is becoming visible. Followed by onResume() if the activity comes into the foreground or onStop() if the activity is made invisible

4. onResume()
When your activity is in the foreground

5. onPause()
When the activity is no longer in the foreground because another activity is resuming. 

6. onStop()
When the activity is no longer visible

7. onDestroy()
when your activity is about to be destroyed or finished


## Layouts 

- Relative, 
- Linear, 
- Grid 

## Toasts 
```
Toast toast = Toast.makeText(this, text, duration);
toast.show()
```
## Fragments
> Make it modular

Fragments allow you to reuse code

#### Lifecycle
onAttach()
onCreate()
onCreateView()
onActivityCreated()
onStart()
onResume()
onPause()
onStop()
onDestroyView()
onDestroy()
onDetach()

We need to use **an interface** to decouple the fragment from the activity. We have two objects that need to talk to each other, the fragment and the activity and we want them to talkt without onse side knowing too much about the other.


</details>