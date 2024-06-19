"use client";
import Image from "next/image";
import { GiGalaxy } from "react-icons/gi";
import { motion } from "framer-motion";
export default function Hero() {
  return (
    <section
      id="hero"
      className="min-h-screen flex items-center justify-center relative "
    >
      {/* BACKGROUND IMAGE */}
      <Image
        src={"/images/bg.jpg"}
        alt="background image"
        layout="fill"
        quality={100}
        priority={true}
      />

      {/* CONTENT CONTAINER */}
      <div className="w-full flex items-center justify-between flex-col md:flex-row px-[5%] z-10">
        {/* TEXT CONTAINER */}
        <div className="flex flex-col items-start justify-center gap-2">
          <p className="text-sm text-sky-500 tracking-wider font-bold z-10">
            Made For Gamers
          </p>
          <h1 className="text-4xl lg:text-7xl max-w-2xl drop-shadow-lg tracking-wider font-extrabold">
            Welcome to Gaming Sphere
          </h1>
          <p className="text-md tracking-wider font-bold text-neutral-400 max-w-xl font-secondary mt-2">
            A Centralized hub for like-minded gamers to communicate and discuss
            gaming news, events, and general info with each other
          </p>
          <motion.div
            whileTap={{ scale: 0.9 }}
            whileHover={{ scale: 1.05, opacity: 0.7 }}
            className="cursor-pointer mt-2 flex flex-row items-center justify-center gap-2 bg-gradient-to-r from-blue-500 to-fuchsia-400 italic py-3 px-6 rounded-2xl font-bold text-md tracking-wider"
          >
            <GiGalaxy />
            <p>Explore Games</p>
          </motion.div>
        </div>
      </div>
    </section>
  );
}
