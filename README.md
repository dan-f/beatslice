beatslice
=======

An ongoing (in-progress) project to build a live sampling interface focused on
combining both algorithmic and user-played processes for performance.

INSTALL:
--------

1. Download and install Pd-Extended at
        http://puredata.info/downloads/pd-extended
2. Download and install pdj at
        http://puredata.info/downloads/pd
        
        * Make sure to read the pdj documentation at the above page.

3. Make the pdj.properties file point to the bin directory in java-src.

NOTE:
-----

This is very much a work in progrss. The interface is only half-implemented,
and still very much conceptual. The basic idea is to split a music sample into
8 subdivisions. Each cell across a row of the Launchpad represents one of these
subdivisions (leftmost is the first subdivision, rightmost is the last). When
randomization is turned on, the user can select/deselect cells, thus removing
subdivisions from the sample 'pool' making the patch only choose from
subdivisions which are currently ligt up.

TODO:
-----

* Implement quantization for starting/stopping randomization.
* Implement a MLR-like step sequencing mode when randomization is off.
* Allow multiple samples to be loaded, each corresponding to a different row on
  the launchpad.
* Quantize all samples together.
* Be able to choose quantization depth and turn it on or off.
* More to come...
