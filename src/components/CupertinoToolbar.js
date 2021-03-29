import React, { Component } from "react";
import styled, { css } from "styled-components";
import IoniconsIcon from "react-native-vector-icons/dist/Ionicons";
import MaterialCommunityIconsIcon from "react-native-vector-icons/dist/MaterialCommunityIcons";

function CupertinoToolbar(props) {
  return (
    <Container {...props}>
      <ButtonWrapper1>
        <ButtonOverlay>
          <IoniconsIcon
            name="ios-navigate"
            style={{
              backgroundColor: "transparent",
              opacity: 0.8,
              color: "#007AFF",
              fontSize: 24
            }}
          ></IoniconsIcon>
        </ButtonOverlay>
      </ButtonWrapper1>
      <ButtonWrapper2>
        <ButtonOverlay>
          <MaterialCommunityIconsIcon
            name="television"
            style={{
              backgroundColor: "transparent",
              opacity: 0.8,
              color: "#007AFF",
              fontSize: 24
            }}
          ></MaterialCommunityIconsIcon>
        </ButtonOverlay>
      </ButtonWrapper2>
      <ButtonWrapper3>
        <ButtonOverlay>
          <IoniconsIcon
            name="ios-share"
            style={{
              backgroundColor: "transparent",
              opacity: 0.8,
              color: "#007AFF",
              fontSize: 24
            }}
          ></IoniconsIcon>
        </ButtonOverlay>
      </ButtonWrapper3>
      <ButtonWrapper4>
        <ButtonOverlay
          style={{
            backgroundColor: props.active
              ? "rgba(0, 122, 255,0.1)"
              : "transparent"
          }}
        >
          <IoniconsIcon
            name={
              props.active
                ? "ios-information-circle"
                : "ios-information-circle-outline"
            }
            style={{
              backgroundColor: "transparent",
              opacity: 0.8,
              color: "#007AFF",
              fontSize: 24
            }}
          ></IoniconsIcon>
        </ButtonOverlay>
      </ButtonWrapper4>
    </Container>
  );
}

const Container = styled.div`
  display: flex;
  padding: 8px;
  flex-direction: row;
  align-items: center;
  justify-content: space-between;
  background-color: rgba(255,255,255,0.5);
`;

const ButtonOverlay = styled.button`
 display: block;
 background: none;
 height: 100%;
 width: 100%;
 border:none
 `;
const ButtonWrapper1 = styled.div`
  flex: 1 1 0%;
  flex-direction: column;
  align-items: center;
  min-width: 30px;
  max-width: 36px;
  height: 38px;
  border-radius: 4px;
  justify-content: center;
  border: none;
  display: flex;
`;

const ButtonWrapper2 = styled.div`
  flex: 1 1 0%;
  flex-direction: column;
  align-items: center;
  min-width: 30px;
  max-width: 36px;
  height: 38px;
  border-radius: 4px;
  justify-content: center;
  border: none;
  display: flex;
`;

const ButtonWrapper3 = styled.div`
  flex: 1 1 0%;
  flex-direction: column;
  align-items: center;
  min-width: 30px;
  max-width: 36px;
  height: 38px;
  border-radius: 4px;
  justify-content: center;
  border: none;
  display: flex;
`;

const ButtonWrapper4 = styled.div`
  flex: 1 1 0%;
  flex-direction: column;
  align-items: center;
  min-width: 30px;
  max-width: 36px;
  height: 38px;
  border-radius: 4px;
  justify-content: center;
  background-color: props.active ?
    "rgba(0, 122, 255,0.1)" : "transparent";
  border: none;
  display: flex;
`;

export default CupertinoToolbar;
