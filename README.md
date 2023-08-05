
RecyclerView

The time Recyclerview introduced to Android memory utilisation
improved as it has advantage over Listview and gridview. It is
actually advanced and flexible version of ListView and GridView.

Creating a scrollable list of elements is a common pattern in
mobile application. Using RecyclerView we can list a large
data sets using least possible memory.

Using recyclerview we can implement horizontal, vertical as
well as expandable list.The main use of recyclerview is when we
have large set of data which get updated at runtime and this
large set of data is not stored in the device while in use.

Recyclerview was first used in Material Design in Android 5
(Lollipop) and recyclerview widget is a part of seperate library
valid for API level 7 and high.

Layout Manager is introduced in recyclerview for declaring the
type of layout which we want to use.
Following layouts are availabel in layout manager.
1 Linear Layout Manager - Linear Layout Manager is used to present
data in a linear view like horizontal or vertical scorll list.
2 Grid Layout Manager - Grid Layout Manager is used to present
data in grid view.
3 Staggered Grid Manager - Staggered Grid Layout Manager is used
present data in staggered grid view.

Adapter is used to bind an app specific data set to view that are
to be displayed within recyclerview.Adapter holds important
 methods dealing with the implementation of RecylcerView. The
basic methods for implementation are as follows.

1 onCreateViewHolder - which deals with the inflation of the
layout as an item for the RecyclerView.
2 onBindViewHolder - which deals with the setting of different data
 and methods related to clicks on particular items position of the
 RecyclerView.
3 getItemCount - which Returns the length of the RecyclerView.
4 onAttachedToRecyclerView - which attaches the adapter to the RecyclerView.
