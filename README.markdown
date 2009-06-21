# Bruce's Clojure experiments

I'm learning Clojure, and these are my experiments.

These may come to nothing.

## Sources

I've been doing some random hacking using the following resources (+ others):

* Stu Halloway's "Programming Clojure,"
  http://www.pragprog.com/titles/shcloj/programming-clojure 
* Various bits and pieces found in Phil Hagelberg's GitHub repos & forks:
  http://github.com/technomancy
* Phil Hagelberg's great article on setting up Emacs for Clojure; I've roughly
  followed the library structure he recommends, just adding `vendor/` for
  submodules so I can regenerate the deps in `target/dependency/` as they're
  updated.
  
I'm using Phil Hagelberg's forks of clojure & contrib vs the official sources,
just because I'm lazy it was easier to grab them all in a row... and
presumably they may be better tested than whatever's in the official sources'
HEADs.

## Running it

For now, let's consider "running" getting the REPL up w/ my experiments
available.

You'll need `ant`, as I don't check-in built copies of dependencies.  If
you're trying on Windows... sorry; these instructions probably won't work for
you.

First, get the stuff we need in `vendor/` (including clojure itself)

    $ git submodule init
    $ git submodule update
    
Now, build out `target/dependency/`

    $ ./build-dependencies.sh
    
If you're rebuilding, you may need to answer a couple questions. `A` is likely
the right answer.

Now, run the REPL:

    $ ./repl.sh
    
Now you're on your own.  In the unlikely event I write something worth loading
into anyone else's REPL, here's where you'd do it.

    (use 'codefluency.something.experimental)
    
    