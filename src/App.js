import React, {Component} from "react";
import axios from 'axios';

import { BrowserRouter as Router, Route } from "react-router-dom";
import "./icons.js";
import ContactUs from "./screens/ContactUs";
import Home from "./screens/Home";
import Home1 from "./screens/Home1";
import HomePage from "./screens/HomePage";
import HomePage1 from "./screens/HomePage1";
import NsGinfo from "./screens/NsGinfo";
import NsGinfo1 from "./screens/NsGinfo1";
import Untitled from "./screens/Untitled";
import "./style.css";
import styled, { css } from "styled-components";

import { createStackNavigator } from '@react-navigation/stack';
import { NavigationContainer } from "@react-navigation/native";
 
class App extends Component {
  
    state = {
      // Initially, no file is selected
      selectedFile: null
    };
    
    // On file select (from the pop up)
    onFileChange = event => {
    
      // Update the state
      this.setState({ selectedFile: event.target.files[0] });
    
    };
    
    // On file upload (click the upload button)
    onFileUpload = () => {
    
      
      const header = {
        'Content-Type': 'multipart/form-data',
      }; 

      // Create an object of formData
      const formData = new FormData();
    
      // Update the formData object
      formData.append('file', this.state.selectedFile, this.state.selectedFile.name);
      formData.append('Metadata', JSON.stringify({'patient_id':'2222','filename': this.state.selectedFile.name,'type':'samseg'}));
      //formData.append('Metadata', {'filename':'orig.zip', 'patient_id':'0113','patient_name':'unknown','type':'samseg'});
    
      // Details of the uploaded file
      console.log(this.state.selectedFile);
    

      // Request made to the backend api
      // Send fileName and formData object
      axios.post("https://t1ox5zmkeg.execute-api.us-east-1.amazonaws.com/Testing/convert", formData, header)
      .then((response) => {
        console.log(response);
      }, (error) => {
        console.log(error);
      });
    };
    
    // File content to be displayed after
    // file upload is complete
    fileData = () => {
    
      if (this.state.selectedFile) {
         
        return (
          <div>
            <h2>File Details:</h2>
             
<p>File Name: {this.state.selectedFile.name}</p>
 
             
<p>File Type: {this.state.selectedFile.type}</p>
 
             
<p>
              Last Modified:{" "}
              {this.state.selectedFile.lastModifiedDate.toDateString()}
            </p>
 
          </div>
        );
      } else {
        return (
          <div>
            <br />
            <h4>Choose before Pressing the Upload button</h4>
          </div>
        );
      }
    };
    
    render() {
    
      return (
        <div>
            <h1>
              NVision
            </h1>
            <h3>
              File Upload
            </h3>
            <div>
                <input type="file" onChange={this.onFileChange} />
                <button onClick={this.onFileUpload}>
                  Upload!
                </button>
            </div>
          {this.fileData()}
        </div>
      );
    }
  }

export default App;


/*
const Stack = createStackNavigator();

function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Login" component = {Home} />
      </Stack.Navigator>
      </NavigationContainer>
  );
}
*/

/*
send request in form api format needs


type = default, samseg, reconall, fsl
Req = request.post(url, payload = {“patient”: id, “file”: file}, type)



<Router>
        <Route path="/" exact component={Home} />
        <Route path="/HomePage/" exact component={HomePage} />
        <Route path="/Home/" exact component={Home} />
        <Route path="/ContactUs/" exact component={ContactUs} />
        <Route path="/Home1/" exact component={Home1} />
        <Route path="/HomePage1/" exact component={HomePage1} />
        <Route path="/NsGinfo/" exact component={NsGinfo} />
        <Route path="/NsGinfo1/" exact component={NsGinfo1} />
        <Route path="/Untitled/" exact component={Untitled} />
      </Router>



      /*
      fetch('https://t1ox5zmkeg.execute-api.us-east-1.amazonaws.com/Testing/convert', {
        method: 'POST',
        headers: {
          'Content-Type': 'multipart/form-data',
        },
        body: JSON.stringify({
          firstParam: 'file',
          secondParam: 'Metadata',
        })
      }).then((response) => {
        console.log(response.data);
      }, (error) => {
        console.log(error);
      });
      */
