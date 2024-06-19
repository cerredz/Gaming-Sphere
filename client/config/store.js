import { configureStore } from "@reduxjs/toolkit";
import authReducer from "./authSlice.js";

export const createStore = () => {
  return configureStore({
    reducer: {
      auth: authReducer,
    },
  });
};
