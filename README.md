## OnlyFives

An Android rating dialog to helps solicite feedback and get higher ratings

## Usage

As a developer I want only 4 and 5 star ratings to be taken to the Play Store to review my application. 
OnlyFives can filter who intends on rating 4 or 5 stars and make decisions to solicit feedback or take them to the Store.

An .aar file of the latest build is included to make things simple.
To include into your project add the following to your apps build.gradle Be sure to also add the .aar to your libs folder.

    allprojects {
       repositories {
          jcenter()
          flatDir {
            dirs 'libs'
          }
       }
    }

    dependencies {
        compile(name:'onlyfives', ext:'aar')
    }

## Features

* Light or Dark
* Customize the accent color
* Specify how many stars solicit feedback 

## Screenshots

<img src="https://github.com/matthewrice345/OnlyFives/blob/master/screens/screenshot_1.png" alt="OnlyFives Screenshot 1" width="400" height="681"> <img src="https://github.com/matthewrice345/OnlyFives/blob/master/screens/screenshot_2.png" alt="OnlyFives Screenshot 2" width="400" height="681">

<img src="https://github.com/matthewrice345/OnlyFives/blob/master/screens/screenshot_3.png" alt="OnlyFives Screenshot 3" width="400" height="681"> <img src="https://github.com/matthewrice345/OnlyFives/blob/master/screens/screenshot_4.png" alt="OnlyFives Screenshot 4" width="400" height="681">

## License

       Copyright 2016 Matthew Rice
   
       Licensed under the Apache License, Version 2.0 (the "License");
       you may not use this file except in compliance with the License.
       You may obtain a copy of the License at

           http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing, software
       distributed under the License is distributed on an "AS IS" BASIS,
       WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
       See the License for the specific language governing permissions and
       limitations under the License.
