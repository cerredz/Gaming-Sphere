// StoreProvider.jsx

import { Provider } from "react-redux";
import { createStore } from "./store";

export function StoreProvider({ children }) {
  const store = createStore();
  return <Provider store={store}>{children}</Provider>;
}
