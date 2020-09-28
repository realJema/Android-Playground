# Android-Playground

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