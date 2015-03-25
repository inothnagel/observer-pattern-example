A very basic example of the observer pattern in action for demonstration purposes.

Start reading the code at `ObserverExample.java`.

When the code is run, the output is:

```
ObservableValue (3): I have been created with a value of 3.
ObservableValue (5): I have been created with a value of 5.
ObservableValue (3): An observer has registered with me to receive notifications when I change.
ObservableValue (5): An observer has registered with me to receive notifications when I change.
ObservableValue (3): An observer has registered with me to receive notifications when I change.
ObservableValue (5): An observer has registered with me to receive notifications when I change.

Client: Changing value a from 3 to 7.
ObservableValue (3): My value has changed from 3 to 7. I will notify my observers.
SumObserver: I have been notified of a change to one of my values. My new result is 12.
DiffObserver: I have been notified of a change to one of my values. My new result is 2.

Client: Changing value b from 5 to 9.
ObservableValue (5): My value has changed from 5 to 9. I will notify my observers.
SumObserver: I have been notified of a change to one of my values. My new result is 16.
DiffObserver: I have been notified of a change to one of my values. My new result is -2.
```


