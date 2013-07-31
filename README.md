

# maps4cim

maps4cim is a map generator for the traffic simulation game
[Cities in Motion 2][1], which creates maps based on real parts of the world.

The required source data for relief and inscriptions are downloaded on demand 
from free data sources. The elevations are directly integrated in the resulting 
map, all further data (roads, forests, rivers, buildings, ...) are painted on 
the ground texture, so they can be recreated in the map editor.

The following free (as in [free beer and in free speech][4]) data sources are 
used by maps4cim:

* [SRTM][2]: Elevations of the earth's surface with a resolution of about 90x90 
  meters per data point. The data comes directly from the servers of the
  [United States Geological Survey][5] (many thanks!)
* [OpenStreetMap][3]: Free map data from which the ground textures are generated 
  that will be shown on the resulting map. The required data for the selected 
  map sections is downloaded from the [Overpass][6]-Servers (with best regards 
  to the operators!)

## Discussion & Support

For more information, visit the forums:

* [cimexchange.com](http://www.cimexchange.com/topic/2204-beta-maps4cim-a-real-world-map-generator-for-cim-2/) (en)
* [citiesinmotion.net](http://www.citiesinmotion.net/index.php?page=Thread&postID=31558) (ger)

## Release

Get the latest release from

* [Exchange](http://www.cimexchange.com/files/file/694-maps4cim/) (en)
* [Filebase](http://www.citiesinmotion.net/index.php?page=DatabaseItem&id=455) (ger)

## Get involved

This is an early source code release, with important parts of the code in an
undocumented and rather dirty state.

Still, if you want to contribute new features, don't hesitate to do so.
Fork the project and write your code, and if you like what you've done and
think it may be useful for others, create a pull request.

## Changelog

*0.9.1 beta*

* Colorful log messages
* Improved error handling
* Default save location for Windows set to CiM 2 map folder
* Data source for texture and relief can be selected now
* GUI arrangement improved, relief and texture download can be disabled

*0.9 beta*

* Initial release
* so many features... just launch the program :)

## License

    maps4cim - a real world map generator for CiM 2
    Copyright 2013 Sebastian Straub
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.



[1]: http://www.citiesinmotion2.com/ "Cities in Motion 2"
[2]: http://www2.jpl.nasa.gov/srtm/ "Shuttle Radar Topography Mission"
[3]: http://www.openstreetmap.org/ "OpenStreetMap"
[4]: http://en.wikipedia.org/wiki/Open_data "Open Data (wikipedia.org)"
[5]: http://www.usgs.gov/ "United States Geological Survey"
[6]: http://wiki.openstreetmap.org/wiki/Overpass_API "Overpass API"


