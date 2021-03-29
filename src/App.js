import React from "react";
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

import { createStackNavigator } from '@react-navigation/stack';
import { NavigationContainer } from "@react-navigation/native";

const Stack = createStackNavigator();

function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Login" component = {Home} />
        <Stack.Screen name="Home" component = {HomePage} />
      </Stack.Navigator>
      </NavigationContainer>
  );
}

export default App;


/*
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
*/