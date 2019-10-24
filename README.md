
# react-native-samba-player-nativo

## Getting started

`$ npm install react-native-samba-player-nativo --save`

### Mostly automatic installation

`$ react-native link react-native-samba-player-nativo`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNSambaPlayerNativoPackage;` to the imports at the top of the file
  - Add `new RNSambaPlayerNativoPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-samba-player-nativo'
  	project(':react-native-samba-player-nativo').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-samba-player-nativo/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-samba-player-nativo')
  	```


## Usage
```javascript
import RNSambaPlayerNativo from 'react-native-samba-player-nativo';

// TODO: What to do with the module?
RNSambaPlayerNativo;
```
  