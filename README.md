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

## Content Providers
supplies data from one application to other on request, a content provider can use different ways to store its data in a database, files or even a network.
Content providers let you centralize content in one place and have many different applications access it as needed.
#### Methods
- insert()
- update()
- delete()
- query()
```
public class MyApplication extends ContentProvider {
}
```

#### Content URI's
format
`<prefix>://<authority>/<data_type>/<id>`
*prefix*: This is always set to *content://*
*authority*: specifies the name of the content provider ex: contacts, browser etc
*data_type*: This indicates teh type fo data that this provider provides
*id*: specifies the specific record requested

#### Creating content provider
- Create class which extends _ContentProviderbaseclass_
- define URI
- create db
- implement queries
- register content provider in your activity file using <provider> tag

## Fragments
A fragment has its own layout and its own behaviour with its own life cycle callbacks, you can add or remove them in an activity while the activity is running.
You can combine multiple fragments in a single activity to build a multi-pane UI.
#### Types
- Single frame fragments
- List fragments
- Fragments transaction

## Intents
Abstract description of an operation to be performed. It can be used with;
*startActivity*
     launch an activity
*broadcastIntent*
    send it to any interested BroadcastReceiver components
*startService(Intent) or bindService(Intent, ServiceConnection, int)*
    communicate with a background service

> The Intent itself, an intent object is a passive data structure holding an abstract description of an operation to be performed

#### Intent Objects
bundle of information which is used by the component that receives the intent as well as information used by the android stystem
###### *Action*
This is mandatory part of the intent and is a string naming the action to be performed
set by the *setAction()*
read by *getAction()*

###### *Data*
Adds a data specification to the intent

###### *Category*
optional part of intent object and its a string containing additional information about the kind of component that should handle the intent.
*addCategory()*
*removeCategory()*

###### *Extras*
This will be in key-value pairs for additional information that should be delivered to the component handling the intent.

###### *Flags*
optional parts of intent object and instruct the android system how to launch an activity and how to treat it after its launched

### Types of Intent

#### Explicit Intents
Connect one activity to another activity, these intents designate the target component by its name and they are typically used for application internal messages eg. an activiyt starting a subordinate service or launching a sister activity.
```
// Explicit Intent by specifying its class name
Intent i = new Intent(FirstActivity.this, SecondActivity.class);

// Starts TargetActivity
startActivity(i);
```

#### Implicit Intents
used to activate components in other applications

```
Intent read1 = new Intent();
read1.setAction(android.content.Intent.ACTION_VIEW);
read1.setData(ContactsContract.Contacts.CONTENT_URI);
startActivity(read1);
```

## Layouts

- Linear Layout
- Relative Layout
- Table Layout
- Absolute Layout
- Frame Layout
- List View
- Grid View

### View
A view is an object that draws something on the screen that the user can interact with and a **viewGroup** is an object that holds other Views(and ViewGroup) objects in order to define the layout of the user interface.

### Events
Evants are useful ways to collect data about a user's interaction with interactive components of an application.

**Event Listeners**
These methods will be called by the Android framework when the View to which the listener has been registerd is triggered by user interaction with the item in the UI
**Event Listeners Registration**
Process by which an Event Handler gets registered with an Event Listener so that the handler is called when the Event Listener fires the event
**Event Handlers**
When an event happens and we have registered the event listener for the event, the event listener calls the Event Handlers, which is the method that actually handles the event.

#### Event Listeners & Event Handlers
- onClick()
- onLongClick()
- onFocusChange()
- onKey()
- onTouch(): gestures
- onMenuItemClick()
- onCreateContextMenu(): This is called when the context menu is being built(as a result of a sustained long click)

## Drag n Drop
Android drap and drop framework allows your users to move data from one View to another View in the current layout using a graphical drag and drop gesture.
#### Process
**Started**
When you start dragging an item in a layout, your application calls the _startDrag()_ method to tell the system to start a drag.
arguments: data to be dragged, metadata for this data and a callback for drawing the drag shadow
the system sends a drag event with the action type **ACTION_DRAP_STARTED** to the registered drag event listeners
**Continuing**
user continues the drag, system sends **ACTION_DRAG_ENTERED** action followed by **ACTION_DRAG_LOCATION** action. The drag event listener receives a **ACTION_DRAG_EXITED** action after the user has moved the drag shadow outside the bounding box of the View.
**Dropped**
user releases **ACTION_DROP**
**Ended**
just after the **ACTION_DROP** the system sends out a drag event with action type **ACTION_DRAG_ENDED** to indicate that the drag operation is over


## Notifications
a message you can display to the user outside of your application's normal UI

## SMS
SmsManager API or devices Built-in SMS application to send SMS's

## Animations
The process of crating motion and shape change


























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